from Node import Node
from Person import Person

class LinkedList:
# __init__() 1 point --- initializes an empty linked list
    def __init__(self):
            self.head = None
            self.tail = None
            self.size = 0

# search(string)â†’LinkedList 5 points --------- returns a linked list of objects with a name attribute equal to the provided string
    def search(self, string):
        myLinkedList = LinkedList()
        current_node = self.head
        while current_node:
            if current_node.data.getName() == string:
                myLinkedList.add(current_node.data)
            current_node = current_node.next
        return myLinkedList

# add(object) 2 points ---------- appends the object provided as parameter to the list
    def add(self, e):
        # precondition  : e matches the format of class Person
        # postcondition : the new element is at the end of the linked list
        n = Node()
        n.setData(e)
        if self.size == 0:
            self.head = n
            self.tail = n
        else:
            currentlyTheLastElement      = self.tail
            n.setPrevious(currentlyTheLastElement)
            currentlyTheLastElement.setNext(n)
            self.tail                    = n
        self.size = self.size + 1

        '''new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        self.length += 1'''

# insert(int, object) 5 points --------- places the provided object at index equal to the provided integer
    def insert(self, index, data):
        new_node = Node()
#        new_node = self.setData(data)
        current = self.head
#index 0 or empty???
        if index == 0 or self.head == None:
            new_node.next = self.head
            self.head = new_node
            return
        for i in range(index - 1):
            if current.next == None:
                break
            current = current.next
        new_node.next = current.next
        current.next = new_node


# length() â†’ int 2 points --------- returns the length of the list as an integer
    def length(self):
        return(self.size)

# __getitem__(int) â†’ Person 5 points -------- returns the object stored at the index of the list equal to the integer provided as parameter
    def __getitem__(self, i):
        currentElement = self.head
        howManyIHaveSkippedOver = 0
        while (howManyIHaveSkippedOver < i):
            #using the function from the nodes to get the next instead of operating directly
            currentElement = currentElement.getNext()
            howManyIHaveSkippedOver = howManyIHaveSkippedOver + 1
        return(currentElement.getData())  

# delete(int) 10 points ----------- deletes from the list the element at the index provided as parameter
    def delete(self, value):
        node_current = self.head
        node_previous = None
        node_next = None
        counter = 0
        while counter < value:
            node_previous = node_current
            node_current = node_current.getNext()
            counter += 1
            if node_current == None:
                return None
            node_next = node_current.getNext()
            if node_previous != None:
                node_previous.setNext(node_next)
            if node_next != None:
                node_next.setPrevious(node_previous)


if __name__=="__main__":
    samplePerson1 = Person("Jaime", "Crashboat Beach", "111-222-3333")
    samplePerson2 = Person("maria", "cape cod", "111-222-3333")
    samplePerson3 = Person("Jaime", "Malibu Beach", "something else")
    samplePerson4 = Person("an element to add", "somewhere", "999-999-9999")
    samplePerson5 = Person("alisha", "california", "123-456-7869")
    myLinkedList = LinkedList()
    #test 1:this will delete sampleperson1 as I entered its index # and then print the updated list, this delete the first element 
    myLinkedList.delete(0)
    print(myLinkedList)
    #test 2: delete from the middle of the list, sampleperson3 will be deleted as it is at index 2 and is in the middle
    myLinkedList.delete(2)
    print(myLinkedList)
    #test 3: delete from the end of the list, sampleperson5 will be deleted as it is at index 4 and is last
    myLinkedList.delete(4)
    print(myLinkedList)
    #test 4: insert at the tail
    samplePerson6 = Person("shalini", "arizona", "567-789-0000")
    myLinkedList.insert(4, samplePerson6)
    print(myLinkedList)
    #test 5: insert at the head
    #test 6: insert at the middle
