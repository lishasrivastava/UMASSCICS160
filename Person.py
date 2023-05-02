class Person:

# __init__(newName="none", address="none", phone="999-999-9999") â—¦ initializes a Person object ------- 5 points
    def __init__(self, newName="none", address="none", phone="999-999-9999"):
        self.name = newName
        self.address = address
        self.phone = phone

# setName(string) -------- sets the name of the object to be equal to the string parameter provided
    def setName(self, name):
        self.name = name

# getName()â†’ string 1 point â—¦ returns the name of the Person as a string
    def getName(self):
        return(self.name)

# getPhone()â†’ string 1 point â—¦ returns the phone number of the Person as a string
    def getPhone(self):
        return(self.phone)
    
#str method needed according to gradescope
    def __str__(self):
        stringToReturn = ("Name: " + self.name + "\nAddress: " + self.address + "\nPhone Number: " + self.phone)
        return stringToReturn
