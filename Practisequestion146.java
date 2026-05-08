class employee3{
    int salary;
    public employee3(int salary){
        this.salary=salary;
    }
    public void work(){
        System.out.println("working as a employee...");
    }
    public int getsalary(){
        return salary;
    }
}
class hrmanager extends employee3{
    public hrmanager(int salary){
        super(salary);
    }
    @Override
    public void work(){
        System.out.println("working as a hr manager....");
    }
    public void addemployee(){
        System.out.println("adding a new employee....");
    }
}
public class Practisequestion146 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Employee with methods called work() and getSalary().
        Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee(). */
        hrmanager h=new hrmanager(20000);
        h.work();
        System.out.println(h.getsalary());
        h.addemployee();
    }
}
