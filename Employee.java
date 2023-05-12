public class Employee extends Person{
    private String department;
    
    Employee(String newName, String newAddress, String newPhone, String newDepartment){
        super(newName, newAddress, newPhone);
        this.department = newDepartment;
    }
    
    // getDepartment()→ string
    String getDepartment(){
        return(this.department);
    }

    // setDepartment()
    void setDepartment(String newDepartment){
        this.department = newDepartment;
    }

    //tostring --- like str in python
    public String toString(){
        return("The name of the employee is " + this.name + ". Their address is " + this.address + "and their phone is " + this.phone + " . They work in the following department: " + this.department + ".");
    }
}
