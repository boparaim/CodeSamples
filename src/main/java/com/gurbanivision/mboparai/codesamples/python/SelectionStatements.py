'''
python3 SelectionStatements.py
Created on Feb 22, 2018

@author: boparaim
'''

class SelectionStatements(object):
    '''
    classdocs
    '''

    def __init__(self, costShare, search):
        '''
        Constructor
        '''
        self.administrativeCostPercentage = costShare
        self.searchTerm = search
        
    def donate(self, amount):
        print('donate $'+str(amount)+' to charity A')
        return amount
    
    def showPictures(self, relatedTo):
        print('images of '+relatedTo)
        
    def oneWayIfStatement(self):
        if (self.administrativeCostPercentage < 5):
            self.donate(50);
        
    def twoWayIfStatement(self):
        if (self.administrativeCostPercentage < 5):
            self.donate(50);
        else:
            self.donate(30)
        
    def multiWayIfStatement(self):
        if (self.administrativeCostPercentage < 5):
            self.donate(50);
        elif (self.administrativeCostPercentage < 10):
            self.donate(40);
        else:
            self.donate(30)
    
    # switch case is not available
    # dictionaries can be used instead
    def swithStatement(self):
        output = {
            'dog': self.showPictures,
            'cat': self.showPictures
        }
        try:
            output[self.searchTerm](self.searchTerm)
        except KeyError:
            self.showPictures('scorpion')
    
    def conditionalExpression(self):
        donatedAmount = self.donate(50) if self.administrativeCostPercentage < 5 else self.donate(40)
        donatedAmount = self.donate(50) if self.administrativeCostPercentage < 5 else self.donate(40) if self.administrativeCostPercentage < 10 else self.donate(30)
        
    
selectionStatements = SelectionStatements(5, 'dog')
selectionStatements.oneWayIfStatement()
selectionStatements.twoWayIfStatement()
selectionStatements.multiWayIfStatement()
selectionStatements.swithStatement()
selectionStatements.conditionalExpression()

    
    
        