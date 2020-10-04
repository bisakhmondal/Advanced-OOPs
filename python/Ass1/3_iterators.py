from itertools import compress

def numbers():
    i=1
    while True:
        yield i
        i+=1

evensIdx = [0,1]*10
oddsIdx = [1,0]*10

evenItr = compress(numbers(),evensIdx)
oddsItr = compress(numbers(),oddsIdx)

print("evens: ")
for i in evenItr:
    print(i,end=' ')

print("\nOdds: ")
for i in oddsItr:
    print(i,end=' ')
