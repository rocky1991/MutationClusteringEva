
# Title: DB Scan clustering algorithm implemented for the data mining project
# Author:Hongchuan Wang
# Date: Dec 6, 2018

import csv
# import pandas as pd 
import matplotlib.pyplot as plt 
import numpy as np
import matplotlib.cm as cm

class DBScan:
	def __init__(self,ep,minpts,dataset=[],labels=[],point_neighbors=[],cores_index=[]):
	# ep is the radius for neighbors, minpts is the threshold
		self.dataset = dataset
		self.ep = ep
		self.minpts = minpts
		self.labels = labels
		self.point_neighbors = point_neighbors
		self.cores_index = cores_index

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
	# Calculate Euclidean distance of two array
	def euc_dist(self,x,y):
		x = np.array(x)
		y = np.array(y)
		return np.sum(np.square(x-y))	

	# Check each point to see if they have more than minpts number of neighbors, 
	# if yes, then it is a core point
	def find_cores_index(self):
		n = self.dataset[:,0].size
		self.cores_index = []
		self.point_neighbors = []
		
		for i in range (0,n):
			neighbor_count = 0
			neighbors = []
			for j in range(0,n):
				if(j!= i):
					dist = self.euc_dist(self.dataset[i],self.dataset[j])
					if(dist< self.ep):
						neighbor_count+= 1
						neighbors.append(j)
			self.point_neighbors.append(neighbors)
			if(neighbor_count>= self.minpts):
				self.cores_index.append(i)

	def clustering(self):
		self.find_cores_index()
		n = self.dataset[:,0].size
		cluster_id = 0
		self.labels = np.zeros(n)
		for i in range(0,len(self.cores_index)):
			if(self.labels[self.cores_index[i]]==0):
				cluster_id += 1
				self.labels[self.cores_index[i]] = cluster_id
				self.density_connected(self.cores_index[i],cluster_id)

	def contains(self,list,target):
		flag = False
		for item in list:
			if(item == target):
				flag = True
		return flag
	def density_connected(self,index,cluster_id):
		# print("training...")
		neighbors_indices = self.point_neighbors[index]
		for neighbor_index in neighbors_indices:
			if(self.labels[neighbor_index] == 0):
				self.labels[neighbor_index] = cluster_id
				if(self.contains(self.cores_index,neighbor_index)):
					self.density_connected(neighbor_index,cluster_id)
				else:
					self.labels[neighbor_index] = cluster_id
			else:
				pass
	def plot_clusters(self,file_path,skip_n):
		self.readData(file_path,skip_n)
		self.clustering()
		self.labels=self.labels.astype(int)
		num_Clusters = (max(self.labels)+1)
		clusters = [[] for x in range(num_Clusters)]
		for i in range(0,len(self.dataset[:,1])):
			clusters[self.labels[i]].append(i)

		x = np.arange(num_Clusters)
		ys = [i+x+(i*x)**2 for i in range(num_Clusters)]
		colors = iter(cm.rainbow(np.linspace(0, 1, int(num_Clusters))))
		for i in range(0,num_Clusters):
			plt.scatter(np.array(self.dataset[np.array(clusters[i]),0]),np.array(self.dataset[np.array(clusters[i]),1]),color=next(colors))

			# plt.scatter(np.array(mydb.dataset[np.array(clusters[1]),0]),np.array(mydb.dataset[np.array(clusters[1]),1]),c='blue')
			# plt.scatter(np.array(mydb.dataset[np.array(clusters[2]),0]),np.array(mydb.dataset[np.array(clusters[2]),1]),c='yellow')
		plt.show()


def main():
	# newdb = DBScan(ep=0.1,minpts=8)
	# newdb.plot_clusters('/home/rocky/Desktop/MutationClusteringEva/FCPS/01FCPSdata/Target.lrn',4)
	newdb = DBScan(ep=0.2,minpts=8)
	newdb.plot_clusters('/home/rocky/Desktop/MutationClusteringEva/FCPS/01FCPSdata/Lsun.lrn',4)
if __name__=="__main__":
	main()
