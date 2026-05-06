class employee2{
    String name;
    double salary;
    public employee2(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void calculatesalary(){
        System.out.println("name:"+name+"/t"+"salary:"+salary);
    }
}
class manager2 extends employee2{
    public manager2(String name,double salary){
        super(name,salary);
    }
    public void calculatesalary(){
        System.out.println("name:"+name+"\t"+"post:manager\t"+"salary:"+salary);
    }
}
class programmer2 extends employee2{
    public programmer2(String name,double salary){
        super(name,salary);
    }
    public void calculatesalary(){
        System.out.println("name:"+name+"\t"+"post:programmer\t"+"salary:"+salary);
    }
}
public class Practisequestion178 {
    public static void main(String[] args) {
        /*Write a Java program to create a class Employee with a method called calculateSalary().
        Create two subclasses Manager and  Programmer.
        In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.*/
        manager2 m=new manager2("arvind",23000);
        programmer2 p=new programmer2("anika",35000);
        m.calculatesalary();
        p.calculatesalary();
    }
}
