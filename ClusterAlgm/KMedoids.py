# Title: K-medoids PAM algorithm implementation
# Author: Michael Dickensheets
# Date: Nov 30, 2018

import csv
import matplotlib.pyplot as plt
import numpy as np
import random as r
import math

class KMedoids:
    def __init__(self,dim=1,dataset=[],medoids=[],clusters=[]):
        self.dataset = dataset
        self.medoids = medoids

    # Read Data Function
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
                newMatrix.append(rowdata.astype(np.float))

            self.dataset = np.asmatrix(newMatrix)
            self.dim = self.dataset.shape[1]

    ### Helper functions ###
 
    # Euclidian distance
    def euclidian_distance(self,a,b):
        a = np.array(a)
        b = np.array(b)
        return math.sqrt(np.sum(np.square(a-b)))

    # Hamming distance
    def hamming_distance(self,a,b):
        a = np.array(a)
        b = np.array(b)
        return sum(a[i] != b[i] for i in range(0, len(a)))

    # Jaccard distance
    def jaccard_distance(self,a,b):
        a = np.array(a)
        b = np.array(b)
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
    
    # Weighted selector
    def select_weighted(self, values):
        rand = []
        for i in values:
            rand.append(r.randint(0,math.floor(i)))
        return rand.index(max(rand))


    # Return closest point
    def find_closest(self, p, data):
        distances = []
        for i in data:
            distances.append(self.euclidian_distance(p,i))
        return (distances.index(min(distances)),min(distances))
    
    # Compute hypothetical cost of swapping medoids
    def swap_cost(self, cluster, point):
        return sum(self.euclidian_distance(self.dataset[p],self.dataset[point]) for p in cluster)

    # Initialize medioids
    def initialize(self,k):
        i = 1

        # Choose initial medoid
        self.medoids = np.empty((0,self.dim))
        first = r.randint(0, self.dataset.shape[0])
        self.medoids = np.append(self.medoids, self.dataset[first], axis=0)
        # Compute distance list

        while(i < k):
            distances = []
            for point in self.dataset:
                closest = self.find_closest(point, self.medoids)
                distances.append(closest[1]**2 * 1000)
            toAdd = self.dataset[self.select_weighted(distances)]
            self.medoids = np.append(self.medoids, toAdd, axis=0)
            i += 1

    # k_medoids
    def k_medoids(self,k):
        
        # Initialize
        self.medoids = np.asmatrix(np.empty((k,self.dim)))
        oldmedoids = self.medoids
        self.initialize(k)


        # Begin Voroni
        while(not np.allclose(oldmedoids, self.medoids)):
            oldmedoids = self.medoids
            # Create clusters
            self.clusters = [[] for _ in range(0,k)]
            costs = [0 for _ in range(0,k)]

            # Compute clusters and initial costs
            for p in range(0,self.dataset.shape[0]):
                closest = self.find_closest(self.dataset[p], self.medoids)
                index = closest[0]
                dist = closest[1]
                self.clusters[index].append(p)
                costs[index] += dist

            # Begin swapping procedure
            for i in range(0,k):
                for p in self.clusters[i]:
                    if (self.dataset[p] != self.medoids[i]).all():
                        hypothetical = self.swap_cost(self.clusters[i],p)
                        if (hypothetical < costs[i]):
                            self.medoids[i] = self.dataset[p]
                            costs[i] = hypothetical

mymed = KMedoids()
mymed.readData('/home/boy/fall_2018/data_mining/project/MutationClusteringEva/FCPS/01FCPSdata/TwoDiamonds.lrn',4)
print(mymed.dataset)
mymed.k_medoids(2)


x = np.asarray(mymed.dataset)[:,0]
y = np.asarray(mymed.dataset)[:,1]

colors = ['red', 'orange', 'yellow', 'green', 'blue', 'purple', 'black', 'pink']

for i in range(0,2):
    plt.scatter(x[mymed.clusters[i]],y[mymed.clusters[i]],c=colors[i])

plt.show()
