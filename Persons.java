import java.util.LinkedList;
public class Persons extends Person {
    private LinkedList<Person> listofpeople;

    Persons(String newName, String newAddress, String newPhone, LinkedList<Person> listofpeople){
        super(newName, newAddress, newPhone);
        listofpeople = new LinkedList<Person>();
    }
    
    LinkedList<Person> Search(String name){
        return this.listofpeople;

    }
    //getInternalList() -> List
    LinkedList<Person> getInternalList(){
        return this.listofpeople;
    }
    //delete fucntion, originally you were removing based off words, shuld have been removing based off interger
    void delete(int i){
        listofpeople.remove(i);
    }
    //getsize counter function
    //CHANGE FROM OG, NOT USING COUTNER ANYMORE USE BUILT IN SIZE FUNCTION
    int getSize(){
        return listofpeople.size();
        
    }
    //add for Person 
    void add (Person newperson){
        listofpeople.add(newperson);
        

    }
    //add for Student
    void add (Student newStudent){
        listofpeople.add(newStudent);
    }
    //add for Employee
    void add (Employee newEmployee){
        listofpeople.add(newEmployee);
    }

    
}