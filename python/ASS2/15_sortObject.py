class Student:
    def __init__(self,m1=0,m2=0,m3=0) -> None:
        self.m1=m1
        self.m2=m2
        self.m3=m3

    def sum(self):
        return self.m1+self.m2+self.m3

    def __repr__(self) -> str:
        return f"Student {self.m1} {self.m2} {self.m3}"
sList=[]
for _ in range(int(input("Enter number of students: "))):
    marks = input("enter Marks: ")
    m1, m2, m3 = [int(x) for x in marks.split()]
    sList.append(Student(m1,m2,m3))

decorated = [(stud, stud.sum()) for stud in sList]

decorated.sort(key=lambda x: x[1])

undec= [x[0] for x in decorated]
print(undec)