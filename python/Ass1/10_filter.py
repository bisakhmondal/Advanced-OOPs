listOfN = lambda N: list(range(N))

if __name__ =='__main__':
    inp = int(input("enter N: "))
    listN= listOfN(inp)

    lis= list(map(lambda z: z*z, filter(lambda x: x&1 ==1, listN)))

    print(lis)

