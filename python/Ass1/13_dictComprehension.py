name= input("Enter your name: ")

dicti = { ch:ch.lower() if ch.isupper() else ch.upper() for ch in name}

print(dicti)