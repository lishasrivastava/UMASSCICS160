from Person import Person
class Student:

# __init__(newName="none", address="none", phone="999-999-9999", year=9999) 5 pts ------ initializes a Student object
    def __init__(self, newName="none", address="none", phone="999-999-9999", year=9999):
        self.name = newName
        self.address = address
        self.phone = phone
        self.year = year

# getGraduationYear()â†’ int ----------- returns the graduation year of the Student, as an integer
    def getGraduationYear(self):
        return(self.year)

# setGraduationYear(int) ----------- sets the graduation year of the Student to be equal to the integer parameter provided
    def setGraduationYear(self, year):
        self.year = year

#get name method needed according to gradescope
    def getName(self):
        return(self.name)
    

#str method needed according to gradescope
    def __str__(self):
        stringToReturn = ("Name: " + self.name + "\nAddress: " + self.address + "\nPhone Number: " + self.phone + "\nGraduation Year: " + self.year)
        return stringToReturn
    
