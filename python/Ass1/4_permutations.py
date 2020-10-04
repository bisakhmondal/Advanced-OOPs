
def Permutation(s, start, end):
    if start==end:
        print(''.join(s))
        return 
    for i in range(start,end):
        s[i],s[start]= s[start], s[i]
        Permutation(s,i+1,end)
        s[i],s[start]= s[start], s[i]


if __name__=="__main__":
    word="ABCD"
    Permutation(list(word),0,len(word))









word ="ABCDE"