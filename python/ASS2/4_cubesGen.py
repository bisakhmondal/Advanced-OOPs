def CubeGen():
    cnt=1
    while cnt<=10:
        yield cnt*cnt*cnt
        cnt+=1


print(list(CubeGen()))