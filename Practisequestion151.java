class employee{
    String name,address,jobtitle;
    int salary;
    public employee(String name,String address,String jobtitle,int salary){
        this.name=name;
        this.address=address;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }
    public double bonuses(){
        return 0.0;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getjobtitle(){
        return jobtitle;
    }
    public int getsalary(){
        return salary;
    }
    public void performance(){
        System.out.println("no such performance reports yet....");
    }
    public void managingprojects(){
        System.out.println("no such projects yet...");
    }
}
class manager extends employee{
    public manager(String name,String address,String jobtitle,int salary){
        super(name,address,jobtitle,salary);
    }
    @Override
    public void performance(){
        System.out.println("generating performance....");
    }
    public void managingprojects(){
        System.out.println("manager"+super.getname()+"managing the project...");
    }
    public double bonuses(){
        return super.salary*0.15;
    }
}
public class Practisequestion151 {
    public static void main(String[] args) {
        /*Write a Java program that creates a class hierarchy for employees of a company. 
        The base class should be Employee, with subclasses Manager, Developer, and  Programmer. 
        Each subclass should have properties such as name, address, salary, and job title. 
        Implement methods for calculating bonuses, generating performance reports, and managing projects. */
        manager m=new manager("akhita","E202","manager",25000);
        System.out.println(m.bonuses());
        m.performance();
        m.managingprojects();
    }
}
