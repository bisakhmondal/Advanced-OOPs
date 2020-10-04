class StringManipulate:
    @classmethod
    def palindromes(cls, st):
        wordList= st.split()
        
        filterPal = lambda word : word == word[::-1]
        
        palins = list(filter(filterPal, wordList))
        print("List of Palindromes: ")
        print(palins)
        
        return palins
    
    @classmethod
    def UniqueWords(cls, st):
        uni = list(set(st.split()))
        return uni

st= "abcba ele abcba qe"

StringManipulate.palindromes(st)
print("Unique words")
print(StringManipulate.UniqueWords(st))



        