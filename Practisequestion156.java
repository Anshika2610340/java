abstract class employee{
    double salary;
    public employee(double salary){
        this.salary=salary;
    }
    abstract void calculatesalary();
    abstract void displayinfo();
}
class manager extends employee{
    String name;
    public manager(double salary,String name){
        super(salary);
        this.name=name;
    }
    @Override
    void calculatesalary(){
        System.out.println("salary is:"+salary);
    }
    @Override
    void displayinfo(){
        System.out.println("name is:"+name);
        System.out.println("salary is:"+salary);
    }
}
class programmer extends employee{
    String name;
    public programmer(double salary,String name){
        super(salary);
        this.name=name;
    }
    @Override
    public void calculatesalary(){
        System.out.println("salary is:"+salary);
    }
    @Override
    public void displayinfo(){
        System.out.println("name is:"+name);
        System.out.println("salary is:"+salary);
    }
}
public class Practisequestion156 {
    public static void main(String[] args){
        /* Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
        Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role. */
        programmer p=new programmer(50000,"john");
        p.calculatesalary();
        p.displayinfo();
    }
}
