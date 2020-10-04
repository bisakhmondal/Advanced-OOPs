import re

def RemoveSpecial(text):
    
    #Regex to replace all but the normal chars
    retext= re.sub('[^ a-zA-Z0-9]+','',text)
    return retext

def RemoveSingleChar(text):
    return ' '.join(i for i in text.split() if len(i)>1)

def RemoveMultipleSpaces(text):
    retext= re.sub('[ ]+',' ',text)
    return retext

def TOLOWER(text):
    return text.lower()

def convertToLiteral(text):
    text = re.sub('n\'t', " not",text)
    text = re.sub('\'ll', " will",text)
    text = re.sub('\'d', " would",text)
    text = re.sub('\'ve', " have",text)
    text = re.sub('\'s', " is",text)
    return text

t="I try so h@rd && got $O          far bUt in tHe      End iT   doEsn't even  matter. A A A  A A a"

print("origial: -> ",t)
print()
print("Special Char: ", RemoveSpecial(t))
print()
print("lower: ", TOLOWER(t))
print()
print("Remove single char: ", RemoveSingleChar(t))
print()
print("Multi spaces removal: ", RemoveMultipleSpaces(t))
print()
print("Convert to literal: ", convertToLiteral(t))
