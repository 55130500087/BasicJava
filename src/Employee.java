public class Employee {
    //Properties
    private int id;
    private String firstname;
    private String lastname;
    private String dept;
    private String positionname;

    //Constructor
    public Employee(){

    }

    public Employee(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //Behaviors or method
    String getFullName(){
        return firstname +" : " + lastname;
    }

    String getPositionname(){
        return "";
    }
}