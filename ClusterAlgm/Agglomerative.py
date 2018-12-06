# Title: Agglomerative clustering algorithm implemented for the data mining project
# Author:Hongchuan Wang
# Date: Dec 6, 2018
import csv
import matplotlib.pyplot as plt 
import numpy as np
import matplotlib.cm as cm
import math
class Agglomerative:
	def __init__(self,dataset=[],clusters=[],dist_mat = []):
	# ep is the radius for neighbors, minpts is the threshold
		self.dataset  = dataset
		self.clusters = clusters
		self.dist_mat = dist_mat
	# Read data in, give n file path, and length of header in number of rows
	def readData(self,file_path,skip_n):
		newMatrix = []
		with open(file_path) as file:
			count = 0
			for row in file:
				# skip header
				if(count <skip_n):
					count+= 1
					continue

				rowdata = row.strip()
				rowdata = np.asarray(row.split('\t'))[1:]
				newMatrix.append(rowdata.astype(np.float))
		self.dataset = np.asmatrix(newMatrix)

	def readResult(self,file_path):
		newMatrix = []
		with open(file_path) as file:
			for row in file:
				rowdata = row.strip(" ")
				rowdata= np.asarray(rowdata.split(","))
				# print(rowdata)
				newMatrix.append(rowdata.astype(np.int))
		self.dataset = np.asmatrix(newMatrix)

	def dist_cal(self,dist_measure,xi,xj):
		n11 = np.sum(np.logical_and(xi,xj))
		n00 = len(xi) - np.sum(np.logical_or(xi,xj))
		n10_n01 = np.sum(np.logical_xor(xi,xj))

		# if(sim_measure == "SMC"):
		# 	return (n11+n00)/(n11+n10_n01+n00)
		# elif(sim_measure == "JC"):
		# 	return n11/(n11+n10_plus_n01)
		# elif(sim_measure == "RC"):
		# 	return n11/(n11+n10_plus_n01+ n00)
		# elif(sim_measure == "Euclidean"):
		# 	return np.sqrt(np.sum(np.square(xi-xj)))
		if(dist_measure == "Hamming"):
			return np.sum(np.logical_xor(xi,xj))
		elif(dist_measure == "Manhattan"):
			return np.sum(np.abs(xi-xj))

	def points_dist_compute(self,sim_measure):
		n = len(self.dataset[:,0])
		dist_mat = np.zeros((n,n))
		for i in range(0,n-1):

			for j in range(i+1,n):
				dist_mat[i,j] = self.dist_cal("Manhattan",self.dataset[i,:],self.dataset[j,:])
		self.dist_mat = dist_mat

	def link_select(self, linkage):
		if(linkage == "Single"):
			return self.single_link
		elif(linkage == "Complete"):
			return self.complete_link
		elif(linkage == "Group"):
			return self.group_avg

	def group_avg(self,C1,C2):
		avg_sim =0 
		num_pairs = len(C1)*len(C2)
		for i in range(0,len(C1)):
			for j in range(0,len(C2)):
				avg_sim += self.dist_mat[C1[i],C2[j]]
		avg_sim = avg_sim/ num_pairs

		return avg_sim
	def clustering(self,dist_measure,linkage,k):
		n = len(self.dataset[:,0])
		print("Compute distantce matrix...")
		self.points_dist_compute(dist_measure)
		clusters = [[] for x in range(n)]
		for i in range(0,n):
			clusters[i].append(i)
		
		link_func = self.link_select(linkage)
		print("Clustering ...")
		while(len(clusters)!= k):

			min_dist_i = n
			min_dist_j = n
			min_dist = math.inf
			for i in range(0,len(clusters)-1):
				for j in range(i+1,len(clusters)):
					cur_dist = link_func(clusters[i],clusters[j])
					if(cur_dist < min_dist):
						min_dist = cur_dist
						min_dist_j = j
						min_dist_i = i
			clusters[min_dist_i].extend(clusters[min_dist_j])
			clusters.pop(min_dist_j)
		print("Clustering complete!!")
		self.clusters = clusters
	def plot_clusters(self,file_path,skip_n,dist_measure,linkage,k):
		self.readData(file_path,skip_n)
		print("Clustering..")
		self.clustering(dist_measure,linkage,k)

		num_Clusters = len(self.clusters)
		# clusters = [[] for x in range(num_Clusters)]
		# for i in range(0,len(self.dataset[:,1])):
		# 	clusters[self.labels[i]].append(i)

		x = np.arange(num_Clusters)
		ys = [i+x+(i*x)**2 for i in range(num_Clusters)]
		colors = iter(cm.rainbow(np.linspace(0, 1, int(num_Clusters))))
		for i in range(0,num_Clusters):
			plt.scatter(np.array(self.dataset[np.array(self.clusters[i]),0]),np.array(self.dataset[np.array(self.clusters[i]),1]),color=next(colors))

			# plt.scatter(np.array(mydb.dataset[np.array(clusters[1]),0]),np.array(mydb.dataset[np.array(clusters[1]),1]),c='blue')
			# plt.scatter(np.array(mydb.dataset[np.array(clusters[2]),0]),np.array(mydb.dataset[np.array(clusters[2]),1]),c='yellow')
		plt.show()

	def tests_select(self,iteration,dist_measure,linkage):
		n = int(self.dataset.shape[0])
		num_tests = ((self.dataset.shape[1]))
		MutationScores = [[] for x in range (iteration)]
		for iter in range(0,iteration):
			k = int(n/2**(iter+1))
			self.clustering(dist_measure,linkage,k)
			print("Number of clusters is set to " + str(k))
			representatives = []
			for cluster in self.clusters:
				representatives.append(cluster[0])
			print("Representative mutants indices are ")
			print(representatives)
			representative_mat = self.dataset[np.array(representatives),:]
			# print(representative_mat)
			tests_kills = np.zeros(num_tests).astype(int)
			for i in range(0,representative_mat.shape[0]):
				for j in range(0,num_tests):
					if(representative_mat[i,j] == 1):
						tests_kills[j] += 1
			# print(tests_kills)
			# print(max(tests_kills))
			# print(np.argmax(tests_kills))
			temp_mat = representative_mat
			temp_tests_kills = tests_kills
			rep_mut_size = temp_mat.shape[0]
			prev_rep_mut_size = 0
			removed = 0
			reserved_tests = []
			while(rep_mut_size != prev_rep_mut_size):
				print("Test kills array is " + str(temp_tests_kills))
				prev_rep_mut_size = rep_mut_size
				index = np.argmax(temp_tests_kills)
				print("index is " + str(index))
				reserved_tests.append(index)
				removed = 0
				for i,mut in enumerate(temp_mat):
					# print("Temp map")
					# print(temp_mat)
					# print("index is " + str(index))
					
					if(mut[0,index] == 1):
						
						# print("Removed is " + str(removed))
						# print("i is " + str(i))
						temp_mat = np.delete(temp_mat,i-removed,axis=0)
						removed += 1
						if(len(temp_mat)== 0):
							break
				temp_tests_kills[index] = 0
				if(len(temp_mat)==0):
					break
				rep_mut_size = temp_mat.shape[0]
			print("Number of killed represensitives is " + str(removed))
			print("Reserved tests are " + str(reserved_tests))
			temp_dataset = self.dataset
			removed = 0
			for i,mut in enumerate(self.dataset):
				for index in reserved_tests:
					if(mut[0,index] == 1):
						temp_dataset=np.delete(temp_dataset,i-removed,axis=0)
						removed += 1
						break
				if(len(temp_dataset)== 0):
					break
			print("The number of killed mutants is " + str(n-len(temp_dataset)))
			MutationScores[iter] = removed/n
			print(MutationScores)


def main():
	np.set_printoptions(threshold=np.nan)
	db = Agglomerative()
	# db.readResult('/home/rocky/Desktop/MutationClusteringEva/test_result/InSort_bin_result.txt')
	# db.tests_select(6,"Manhattan","Group")
	# db.readResult('/home/rocky/Desktop/MutationClusteringEva/test_result/MSTP_bin_result.txt')
	# db.tests_select(7,"Manhattan","Group")
	# db.readResult('/home/rocky/Desktop/MutationClusteringEva/test_result/MSTK_bin_result.txt')
	# db.tests_select(7,"Manhattan","Group")
	# db.readResult('/home/rocky/Desktop/MutationClusteringEva/test_result/DFS_bin_result.txt')
	# db.tests_select(5,"Manhattan","Group")
	db.readResult('/home/rocky/Desktop/MutationClusteringEva/test_result/BFS_bin_result.txt')
	db.tests_select(5,"Manhattan","Group")


	# db = Agglomerative()
	# db.plot_clusters('/home/rocky/Desktop/MutationClusteringEva/FCPS/01FCPSdata/TwoDiamonds.lrn',
	# 4,"Manhattan","Group",2)
if __name__=="__main__":
	main()


