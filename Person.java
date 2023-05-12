public class Person {
    public String name;
    public String address;
    public String phone;
    Person(String newName, String newAddress, String newPhone){
        this.name = newName;
        this.address = newAddress;
        this.phone = newPhone;
    }
    //setname
    void setName(String newName){
        this.name = newName;

    }
    //getname
    String getName(){
        //CHANGED FROM OG, USE PARENTHESES WITH RETURN
        return(this.name);
    }
    //setaddress
    void setAddress(String newAddress){
        this.address = newAddress;
    }
    //getaddress
    String getAddress(){
        //CHANGED FROM OG, USE PARENTHESES WITH RETURN
        return(this.address);
    }
    //setphone
    void setphone(String newPhone){
        this.phone = newPhone;
    }
    //getphone
    String getphone(){
        //CHANGED FROM OG, USE PARENTHESES WITH RETURN
        return(this.phone);
    }
    //tostring --- like str in python
    public String toString(){
        return("The name of the person is " + this.name + ". Their address is " + this.address + "and their phone is " + this.phone + ".");
    }
}
