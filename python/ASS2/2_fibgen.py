def FibGen():
    a,b,cnt =0,1,7
    while cnt:
        yield a
        a,b = b, a+b
        cnt-=1
    # raise StopIteration()

lis = list(FibGen())
print(lis)
