'''
Advanced OOPs

@file problem.py
@author: Bisakh Mondal
'''

class Problem:
    ''' Base Problem class '''

    def __init__(self, text):
        self.text = text
    
    def get_text(self):
        return self.text
