name= input('Enter your Name ')

uppercase= list(set(name)-set(name.lower()))
lowercase= list(set(name)-set(name.upper()))

print('Set Uppercase: ',uppercase)
print('Set lowercase: ',lowercase)

#using {}

uppercase1 = list( {*name}.difference({*name.lower()}))
lowercase1 = list( {*name}.difference({*name.upper()}))

print('using {}')
print(uppercase1)
print(lowercase1)