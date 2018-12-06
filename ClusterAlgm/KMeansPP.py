# Title: K-Means++ clustering algorithm implementation
# Author: Michael Dickensheets
# Date: Nov 15, 2018

import csv
import matplotlib.pyplot as plt
import numpy as np
import random as r
import math

class KMeansPP:
    def __init__(self,dim=1,dataset=[],centroids=[],clusters=[]):
        self.dataset = dataset
        self.centroids = centroids

   
    # Read data function from DBScan
    def readData(self,file_path,skip_n):
        newMatrix = []
        with open(file_path) as file:
            count = 0
            for row in file:
                # skip header
                if(count < skip_n):
                    count += 1
                    continue

                rowdata = row.strip()
                rowdata = np.asarray(row.split('\t'))[1:]
                newMatrix.append(rowdata.astype(np.int))

            self.dataset = np.asmatrix(newMatrix)
            self.dim = self.dataset.shape[1]

    # Binary data read_in
    # If remove_equiv = true, remove pseudo-equivalent points
    def readBin(self,file_path,remove_equiv=1):
        newMatrix = []
        with open(file_path) as file:
            for row in file:
                rowdata = row.strip()
                rowdata = np.asarray(row.split(','))[0:]
                newMatrix.append(rowdata.astype(np.float))

        newMatrix = np.unique(newMatrix, axis=0)
        if remove_equiv:
            index = []
            for i in range(0,len(newMatrix)):
                if np.sum(newMatrix[i])==0:
                    index.append(i)
            newMatrix = np.delete(newMatrix,index,axis=0)
        self.dataset = np.asmatrix(newMatrix)
        self.dim = self.dataset.shape[1]

    ### Helper functions ####
    
    # Compute a new centroid from cluster
    def compute_centroid(self, cluster):
        coords = []
        for i in cluster:
            coords.append(self.dataset[i])
        coords = np.round(np.mean(coords, axis=0))
        return coords
    
    # Weighted selector
    def select_weighted(self, values):
        rand = []
        for i in values:
            rand.append(r.randint(0,math.floor(i)))
        return rand.index(max(rand))

    # Euclidian distance
    def euclidian_distance(self,a,b):
        a = np.array(a)
        b = np.array(b)
        return math.sqrt(np.sum(np.square(a-b)))

    # Hamming distance
    def hamming_distance(self,a,b):
        a = list(np.array(a))[0]
        b = list(np.array(b))[0]
        return sum(a[i] != b[i] for i in range(0, len(a)))

    # Jaccard distance
    def jaccard_distance(self,a,b):
        a = list(np.array(a))[0]
        b = list(np.array(b))[0]
        # Both have attribute
        ones = 0
        # No match
        no_match = 0
        for i in range(0,len(a)):
            if(a[i] == 1 and b[i] == 1):
                ones = ones + 1
            elif(a[i] != b[i]):
                no_match = no_match + 1
        if(ones + no_match == 0):
            return 1.0
        return (no_match / (no_match + ones))


    # Return closest point
    def find_closest(self, p, data, dist):
        distances = []
        for i in data:
            if dist == 1:
                distances.append(self.hamming_distance(p,i))
            elif dist == 2:
                distances.append(self.jaccard_distance(p,i))
            else:
                distances.append(self.euclidian_distance(p,i))
        return (distances.index(min(distances)),min(distances))
    
    def initialize(self,k,dist):
        i = 1

        # Choose initial centroid
        self.centroids = np.empty((0,self.dim))
        first = r.randint(0, self.dataset.shape[0]-1)
        self.centroids = np.append(self.centroids, self.dataset[first], axis=0)
        # Compute distance list

        while(i < k):
            distances = []
            for point in self.dataset:
                closest = self.find_closest(point, self.centroids, dist)
                distances.append(closest[1]**2 * 1000)
            toAdd = self.dataset[self.select_weighted(distances)]
            self.centroids = np.append(self.centroids, toAdd, axis=0)
            i += 1

    # dist == 1: hamming
    # dist == 2: jaccard
    # dist == 3: euclidian
    def k_means_plusplus(self,k,dist):
        
        # Initialize centroid choices
        self.centroids = np.asmatrix(np.empty((k,self.dim)))
        oldcentroids = self.centroids
        self.initialize(k,dist)

        # Begin classic k-means
        while(not np.allclose(oldcentroids, self.centroids)):
            oldcentroids = self.centroids
            # Create clusters
            self.clusters = [[] for _ in range(0,k)] 

            # Compute clusters
            for p in range(0,self.dataset.shape[0]):
                 closest = self.find_closest(self.dataset[p], self.centroids, dist)[0]
                 self.clusters[closest].append(p)
            # Recompute centroids
            self.centroids = np.asmatrix(np.empty((0,self.dim)))
            for i in range(0,k):
                toAdd = np.asarray(self.compute_centroid(self.clusters[i]))
                self.centroids = np.append(self.centroids, toAdd, axis=0)
        

#mykm = KMeansPP()
#mykm.readBin('../test_result/MSTP_bin_result.txt')
#mykm.k_means_plusplus(20)

#x = np.asarray(mykm.dataset)[:,0]
#y = np.asarray(mykm.dataset)[:,1]

#colors = ['red', 'orange', 'yellow', 'green', 'blue', 'purple', 'black', 'pink']

#for i in range(0,8):
#    plt.scatter(x[mykm.clusters[i]],y[mykm.clusters[i]],c=colors[i])

#plt.show()


