import collections

nested = {
'fullname': 'Alessandra',
'age': 41,
'phone-numbers': ['+447421234567', '+447423456789'],
'residence': {
'address': {
'first-line': 'Alexandra Rd',
'second-line': '',
    },
'zip': 'N8 0PP',
'city': 'London',
'country': 'UK',
},
}

seperator='_'
def flatten(dictionary,parent=''):
    tempList=[]
    for key, val in dictionary.items():
        Nkey = key if parent=='' else parent+seperator+key
        if isinstance(val, collections.MutableMapping):
            tempList.extend(flatten(val, Nkey).items())
        else:
            tempList.append((Nkey,val))
    return dict(tempList)


flattend= flatten(nested)

print(flattend)

import pprint

pprint.pprint(flattend)