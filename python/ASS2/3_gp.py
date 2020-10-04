import time

start = time.time()

def geometricProgression(a,q):
    while True:
        if a> 100000:
            print("Loop time: ", time.time()- start)
            return "Iteration is Done" #Like StopIteration(message)
        yield a
        a=a*q 


x= geometricProgression(5,25)
lis= list(x)

print(lis)
print("Total Execution Time: ", time.time()-start)
# x.__next__()