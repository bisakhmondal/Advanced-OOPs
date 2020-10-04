class book:
    def __init__(self, title, pub, page, year):
        self.title= title
        self.pub = pub
        self.page=page
        self.yearOfPublicaton=year
    def __str__(self):
        return 'Title: {} Publisher: {} Pages: {} YoP: {}'.format(self.title, self.pub,self.page,self.yearOfPublicaton)

class ebook(book):
    pass

class journal(book):
    pass

b=book("Book",'p',700,2012)
print(b, type(b))
EB=ebook("EBook",'p',710,2018)
print(EB, type(EB))
J=journal("Journal",'p',1200,2020)
print(J, type(J))