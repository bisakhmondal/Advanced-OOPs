class NewString:
    def __init__(self,st) -> None:  
        self.str=st
    
    def __len__(self):
        print("String Length: ",len(self.str))
        wordList = self.str.split()
        mapW = {}
        length=0
        for w in wordList:
            mapW[w] = mapW.get(w,0)+1
        
        for k,v in mapW.items():
            if v>1:
                length+=len(k)*v
        return length
    def most_common(self):
        wordlist= self.str.split()
        return max(wordlist, key=wordlist.count)

    def __str__(self) -> str:
        return self.str
s= NewString("Hello Hello ! same old, Same old")

print(s,len(s))
print(s.most_common())