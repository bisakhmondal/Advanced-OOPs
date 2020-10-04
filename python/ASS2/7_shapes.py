from abc import ABC, abstractmethod
import math

class shape2D(ABC):
    @abstractmethod
    def area(self):
        pass

class shape3D(ABC):
    @abstractmethod
    def volume(self):
        pass

class square(shape2D):
    
    @classmethod
    def area(cls, len):
        return len*len
class rectangle(shape2D):
    @classmethod
    def area(cls, lena, lenb):
        return lena*lenb

class hexagon(shape2D):
    @classmethod
    def area(cls, len):
        return 3*math.sqrt(3)*len*len/2

class cube(shape2D, shape3D):
    @classmethod
    def area(cls, len):
        return 6*len*len
    
    @classmethod
    def volume(cls,len):
        return len*len*len

class cone(shape2D, shape3D):
    @classmethod
    def area(cls, radius, height):
        return math.pi*math.pow(radius,2) + \
            math.pi*radius*math.sqrt(math.pow(radius,2)+math.pow(height,2))
    
    @classmethod
    def volume(cls,radius,height):
        return math.pi*math.pow(radius,2)*height/3

class cylinder(shape2D, shape3D):
    @classmethod
    def area(cls, radius, height):
        return math.pi*math.pow(radius,2) + \
            2*math.pi*radius*height
    
    @classmethod
    def volume(cls,radius,height):
        return math.pi*math.pow(radius,2)*height


print("Square area: ",square.area(5))
print("Cylinder area: ",cylinder.area(2,3))
print("cylinder volume: ",cylinder.volume(2,3))