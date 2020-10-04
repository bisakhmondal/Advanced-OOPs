class Person:
    def __init__(self,name='',age=0):
        self.__name=name
        self.__age=age
    @property
    def age(self):
        return self.__age
    @property
    def name(self):
        return self.__name

    @age.setter
    def age(self,age):
        self.__age=age

    @name.setter
    def name(self,name):
        self.__name=name

    def __str__(self):
        return f'Person: {self.name} | age: {self.__age}'

p=Person('Bisakh')

p.age=100
p.name='abc'
print(p)

