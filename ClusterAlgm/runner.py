import numpy as np
import KMeansPP
import KMedoids

def greedy_pick(mutants):
    testSet = []
    numKilled = 0
    while(True):
        results = np.sum(mutants,axis=0)
        for i in testSet:
            results[0,i] = 0
        best = np.argmax(results)
        testSet.append(best)
        #check how many mutants killed
        newNumKilled = 0
        for mut in mutants:
            isKilled = 0
            for i in testSet:
                isKilled = isKilled + mut[0,i]
            if isKilled > 0:
                newNumKilled += 1
        #if all mutants killed return set
        if newNumKilled == np.shape(mutants)[0]:
            break
        #if adding additional test cases does not kill more mutants
        if newNumKilled == numKilled:
            del testSet[-1]
            break
        numKilled = newNumKilled
    return testSet

# Calculate mutation score
def mut_score(testSet, dataset):
    killed = set([])
    for i in range(0,np.shape(dataset)[0]):
        for j in testSet:
            if (1.0 == dataset[i,j]):
                killed.update([i])

    print(len(killed)/np.shape(dataset)[0])



##################################
# USAGE ##########################
##################################

# readBin('/path/to/testcase', removeEquivalents=1)
# k_means_plusplus(#ofClusters, distanceMeasure)
# k_medoids(#ofClusters, distanceMeasure)
# distanceMeasure:
#   1 - Hamming
#   2 - Jaccard
#   3 - Euclidian (rounded)


kMean = KMeansPP.KMeansPP()
kMean.readBin('../test_result/MSTP_bin_result.txt')
kMean.k_means_plusplus(10,2)

print(kMean.clusters)

reduced = greedy_pick(kMean.centroids)
mut_score(reduced, kMean.dataset)

kMed = KMedoids.KMedoids()
kMed.readBin('../test_result/MSTP_bin_result.txt')
kMed.k_medoids(9,2)

print(kMed.clusters)

reduced = greedy_pick(kMed.medoids)
mut_score(reduced, kMed.dataset)




