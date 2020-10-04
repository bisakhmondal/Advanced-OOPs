class NewString:
    def __init__(self, st=''):
        self.str= st
        if not isinstance(self.str, str):
            raise TypeError("Expected arguement type string")

    def __len__(self):
        wordLis= self.str.split()
        print("String Length: ",len(self.str))
        length=0
        for w in range(max(0,len(wordLis)-3),len(wordLis)):
            length+=len(wordLis[w])
        return length

s= NewString("Hello! I am 42 years old!")
print('Hello! I am 42 years old! ->',len(s))
s= NewString("Hello! I")
print('hello! I ->', len(s))
