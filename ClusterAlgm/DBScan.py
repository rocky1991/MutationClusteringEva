
# Title: DB Scan clustering algorithm implemented for the data mining project
# Author:Hongchuan Wang
# Date: Nov 7, 2018

import csv
# import pandas as pd 
import matplotlib.pyplot as plt 
import numpy as np
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



mydb = DBScan(ep=5,minpts=2)
mydb.readData('/home/rocky/Desktop/SoftwareTestingAnalysis/project/FCPS/01FCPSdata/Target.lrn')
print(mydb.dataset)

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

	def clustering(self,cores_index):
		find_cores_index()
		n = self.dataset[:,0].size
		cluster_id = 0
		self.labels = np.zeros(n)
		for i in range(0,len(cores_index)):
			if(self.labels[cores_index[i]]==0):
				cluster_id += 1
				self.labels[self.cores_index[i]] = cluster_id
				densityConnected(cores_index[i],cluster_id)
	def contains(self,list,target):
		flag = False
		for item in list:
			if(item == target):
				flag = True
		return flag
	def density_connected(self,index,cluster_id):
		neighbors_indices = self.point_neighbors[index]
		for neighbor_index in neighbors_indices:
			self.labels[neighbor_index] = cluster_id
			if(self.contains(cores_index,neighbor_index)):
				density_connected(neighbor_index,cluster_id)
		



mydb = DBScan(ep=2,minpts=5)
mydb.readData('/home/rocky/Desktop/git/SoftwareTestingAnalysis/project/FCPS/01FCPSdata/Target.lrn',4)
print(len([1,2,3]))
print(len(mydb.dataset))
# plt.scatter(np.array(mydb.dataset[cores_index,0]),np.array(mydb.dataset[cores_index,1]),c='red')

# plt.scatter(np.array(mydb.dataset[501:750,0]),np.array(mydb.dataset[501:750,1]),c='blue')
# plt.show()
