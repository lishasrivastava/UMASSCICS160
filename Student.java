public class Student extends Person{
    private int year;
    
    Student(String newName, String newAddress, String newPhone, int newYear){
        super(newName, newAddress, newPhone);
        this.year = newYear;
    }
    // getGraduationYear()→ string
    int getGraduationYear(){
        return(this.year);
    }
    // setGraduationYear()
    void setGraduationYear(int newYear){
        this.year = newYear;
    }
    //tostring --- like str in python
    public String toString(){
        return("The name of the student is " + this.name + ". Their address is " + this.address + "and their phone is " + this.phone + " . They will graduate in the year " + this.year + ".");
    }
}
