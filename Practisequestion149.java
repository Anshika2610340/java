class person1{
    String firstname,lastname;
    public person1(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
}
class employee1 extends person1{
    String employeeid,jobtitle;
    public employee1(String firstname,String lastname,String employeeid,String jobtitle){
        super(firstname,lastname);
        this.employeeid=employeeid;
        this.jobtitle=jobtitle;
    }
    public String getemployeeid(){
        return employeeid;
    }
    @Override
    public String getlastname(){
        return super.getlastname()+","+jobtitle;
    }
}
public class Practisequestion149 {
    public static void main(String[] args) {
        /*Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
        Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title */
        employee1 e=new employee1("anita","jaiswal","e102","hod");
        System.out.println(e.getemployeeid());
        System.out.println(e.getfirstname());
        System.out.println(e.getlastname());
    }
}
