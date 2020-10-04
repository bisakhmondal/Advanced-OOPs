    student=[10,12,45,60]
    subjects=[15,10,5,6]
    marks=[8,102,55,10]

    if __name__=='__main__':
        lis = list(map(max, zip(student,subjects,marks )))
        print(lis)