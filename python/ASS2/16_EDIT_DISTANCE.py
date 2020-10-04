# from ast import Str
# from os import pathconf


def PrintPath(dp,str1,str2):
    i,j = len(str1)-1, len(str2)-1

    while i >=0 and j>=0:
        if str1[i]==str2[j]:
            print("NO OP")
            i-=1
            j-=1
            if i<0 :
                while j>=0:
                    print("DELETE")
                    j-=1
        
            if j<0 :
                while i>=0:
                    print("INSERT")
                    i-=1
        elif i>0 and dp[i][j]==dp[i-1][j]+1:
            print("DELETE", i,j)
            i-=1
        elif j>0 and dp[i][j] == dp[i][j-1]+1:
            print("INSERT",i,j)
            j-=1
        elif i>0 and j>0 and dp[i][j] == dp[i-1][j-1]+1:
            print("SUBSTITUTE",i,j)
            i-=1
            j-=1
        else:
            print("SUBSTITUTE",i,j)
            i-=1
            j-=1


def EDIT_DISTANCE(str1, str2):
    dp = [[-1]*len(str2) for _ in range(len(str1))]

    def calculate(i,j):
        if i<0:
            return j+1
        if j<0:
            return i+1
        if i==0 and j==0 :
            return 0
        if dp[i][j]!=-1:
            return dp[i][j]
        ans=0
        if str1[i]==str2[j]:
            ans = calculate(i-1,j-1)
        else:
            ans = 1+ min(calculate(i,j-1), calculate(i-1,j-1), calculate(i-1,j))
        
        dp[i][j]=ans
        return ans
    
    minDis = calculate(len(str1)-1,len(str2)-1)

    print("MED minimum Edit Distance", minDis)

    print(dp)
    print("Backtrace")
    PrintPath(dp,str1,str2)


str1 = input("first String ")
str2 = input("first String ")

EDIT_DISTANCE(str1,str2)