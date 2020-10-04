lowercaseAsciiStart=97
numofAlphabets=26

for tup in enumerate(range(lowercaseAsciiStart, lowercaseAsciiStart+numofAlphabets),start=1):
    print(tup[0], chr(tup[1]),end=' | ')