import cProfile

#Complexity O(N*N)
def findTriplets(ar):
    ar.sort()
    print(ar)
    for i in range(len(ar)):
        j, k=i+1, len(ar)-1
        
        while j<=k:
            if ar[j]*ar[j] + ar[i]*ar[i]==ar[k]*ar[k]:
                print("Triplets: ",ar[i],ar[j],ar[k])
                return True
            if ar[j]*ar[j] + ar[i]*ar[i] > ar[k]*ar[k]:
                k-=1
            else:
                j+=1
    return False


arr = [3,2,1,8,6,10,12,24,1231,123,124,3456,578,78,412,3]

cProfile.run('findTriplets(arr)')