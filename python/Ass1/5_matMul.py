
#return mata*matb
def multiply(mata, matb):
    ra, ca = len(mata), len(mata[0])
    rb, cb = len(matb), len(matb[0])
    
    if ca!=rb:
        raise ValueError("Invalid Shape ")
    result = [[0]*cb for i in range(ra)]

    for i in range(ra):
        for j in range(cb):
            for k in range(ca):
                result[i][j]+= mata[i][k]*matb[k][j]
    
    return result

matA= [[1,2,3],
        [3,4,5]]

matB= [ [1,6],
        [4,5],
        [8,9]]

print(multiply(matA,matB))