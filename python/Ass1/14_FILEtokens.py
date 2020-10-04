filename='Ass1/readme.txt'
f= open(filename, 'r')

def uniqueNumeric(fileHeader):
    fileHeader.seek(0)
    maps= {}
    for line in fileHeader:
        
        tokens= line.strip().split()
        for token in tokens:
            idt= id(token) 
            while idt in maps:
                idt<<=1
            maps[idt]=token
    
    return maps

def LineLenManager(fileHeader,maxlen=80):
    fileHeader.seek(0)
    extras=''
    lines=[]
    for line in fileHeader:
        line= extras+' ' +line.strip()
        if len(line)<80:
            extras = line
        elif len(line)>80:
            extras=line[80:]
            lines.append(line[:80])
            print(line[:80])
    if extras!='':
        print(extras)
        lines.append(extras)
    return lines
            


print(uniqueNumeric(f))
print()
print('-'*30,'\n')
LineLenManager(f)