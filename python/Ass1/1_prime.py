# Prime genrator using Sieve of Eratosthenes

import math,random

MaxSize= int(1e4)
prime = [True]*MaxSize


#Sieve
def MakePrime():
    prime[0]=prime[1]=False
    for i in range(2, int(math.sqrt(MaxSize)) ,1):
        if prime[i]==True:
            for j in range(i*i,MaxSize,i):
                prime[j]=False

if __name__=="__main__":
    
    MakePrime()
    
    k= random.randint(0,MaxSize)
    for i in range(k,MaxSize):
        if prime[i]==True:
            print("Prime ", i)
            break
        #continue until a prime is found
        if i==MaxSize-1:
            i=0
