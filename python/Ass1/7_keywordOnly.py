def MySort(*, lis=[], ascending=True):
    l = len(lis)

    for i in range(0,l):
        for j in range(i+1,l):
            if lis[i] >lis[j]:
                lis[i],lis[j] = lis[j], lis[i]
    
    if not ascending:
        lis.reverse()

    return lis

if __name__=="__main__":
    inp = input("enter space seperated inputs ").split()
    #convert to int
    intlist = list(map(lambda x : int(x), inp))
    print("Sorted: ")
    print(MySort(lis=intlist))