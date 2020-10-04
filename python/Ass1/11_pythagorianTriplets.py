N = int(input("Enter N: "))

triplets = [(a,b,c) for a in range(1,N+1) for b in range(a,N+1) \
            for c in range(b,N+1) if a**2 + b**2==c**2 ]

reqTriplets= list(filter(lambda x: not (x[0]<10 or x[1]<10), triplets))

print("Triplets with len greater than 10")
print(reqTriplets)