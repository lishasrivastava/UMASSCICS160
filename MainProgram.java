import java.util.Scanner;
import Persons;
import Person;

public class MainProgram extends Persons{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Student/Employee Personell Directory");
        Scanner keyboardReader = new Scanner(System.in);
        System.out.print("Enter option for list below: \n 1) Display complete directory \n 2) Enter new Person \n 3) Search for Person \n 4) Modify Person Record \n 5) Delete a record \n Q) Quit the program");
        try {
        Persons persons = new Persons();
        int newinput1 = keyboardReader.nextInt();
        System.out.println("Option: " + newinput1);
            //Option 1: Display Complete Directory
            if (newinput1 == 1)
            {
                {System.out.println(persons.getInternalList());}
            }
            //Option 2: Enter new Person
            else if (newinput1 == 2){
                //PART ONE create Person record
                //need name from keyboard
                System.out.print("Enter name: ");
                String inputtedname = keyboardReader.next();
                //need address from keyboard
                System.out.print("Enter address: ");
                String inputtedaddress = keyboardReader.next();
                //need phone # from keyboard
                System.out.print("Enter phone number: ");
                String inputtedphonenumber = keyboardReader.next();

                //PART TWO pick whether this is 'person' classified as student or employee class inputYorN 
                //assuming that every Person record is either a student or an employee, cannot be neither or both
                System.out.println("If you are a student, enter \"Yes\". If not, enter \"No\".");
                String inputtedYorN = keyboardReader.next();
                if (inputtedYorN.equals("yes")){ //yes and no should be treated as an object
                    System.out.print("Enter Graduation Year: xxxx");
                    int inputtedgraduationyear = keyboardReader.nextInt();
                    Student newstudent = new Student(inputtedname, inputtedaddress, inputtedphonenumber, inputtedgraduationyear);
                    persons.add(newstudent);   
                }
                else {
                    System.out.print("Enter department name: ");
                    String inputteddepartment = keyboardReader.next();
                    Employee newemployee = new Employee(inputtedname, inputtedaddress, inputtedphonenumber, inputteddepartment);
                    persons.add(newemployee);
                }
                //show updated list with added record
                System.out.println("Updated List: " +persons.getInternalList());
        }
        //Option 3: Search for Person
        else if (newinput1 == 3){
            System.out.print("Enter the name of the record you are looking for: ");
            String inputname2search4 = keyboardReader.next();
            LinkedList<Person> newlistofpeople = persons.getInternalList();
            for(Person person : newlistofpeople) {
                if (person.getName() != null && (person.getName()).equals(inputname2search4)){
                    System.out.println(person.toString());
                }
            }
        }
        else if (newinput1 == 4){
            System.out.print("Enter the name of the record that you would like to modify: ");
            String nameinput2search4 = keyboardReader.next();
            LinkedList<Person> listofpeople = persons.getInternalList();

            for(Person person1 : listofpeople) {   
                if(person1.getName() != null && person1.getName().equals(nameinput2search4)) {              
                    System.out.print("If you would like to modify the name of this record, enter \"y\" or \"Y\".");
                    String actionableinput = keyboardReader.next();
                    if (actionableinput.equals("y") || actionableinput.equals("Y")){
                        System.out.print("Enter new name: ");
                        String editedname = keyboardReader.next();
                        person1.setName(editedname);
                    }
                    System.out.print("If you would like to modify the address of this record, enter \"y\" or \"Y\".");
                    String actionableinput2 = keyboardReader.next();
                    if (actionableinput2.equals("y") || actionableinput2.equals("Y")){
                        System.out.print("Enter new address: ");
                        String editedaddress = keyboardReader.next();
                        person1.setName(editedaddress);
                    }
                    System.out.print("If you would like to modify the phone number of this record, enter \"y\" or \"Y\".");
                    String actionableinput3 = keyboardReader.next();
                    if (actionableinput3.equals("y") || actionableinput3.equals("Y")){
                        System.out.print("Enter new phone number: ");
                        String editedphonenumber = keyboardReader.next();
                        person1.setName(editedphonenumber);
                    }
            }
            break;
        }
        }
        //Option 5: Delete a Record.
        else if (newinput1 == 5){
            System.out.print ("Enter the name of the record you want to delete: ");
            String name2search4 = keyboardReader.next();
            LinkedList<Person> newlistofpeople = persons.getInternalList();
            
            for(Person newguy : newlistofpeople) {
                if (newguy.getName() != null && newguy.getName().equals(name2search4)) {
                    System.out.println(newguy.toString());
                    newlistofpeople.remove(newguy);
                }
            break;
            }
        } 
        else {
            System.out.println("Your entry was not valid.");
        }
        }

    }

    }
        //Option 4: Modify Person information
        //Option 5: Delete a Record.
        //Option 6: Quit
}

