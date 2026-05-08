class car2{
    String make,model;
    int year;
    public car2(String ma,String mo,int ye){
        make=(ma==null || ma.isEmpty())?"unknown":ma;
        model=(mo==null || mo.isEmpty())?"unknown":mo;
        year=(ye<=0)?2026:ye;
    }
}
public class Practisequestion141 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Car with instance variables make, model, and year.
        Implement a parameterized constructor that initializes these variables and assigns default values if not provided.
        Print the values of the variables. */
        car2 c=new car2("toyota","corolla",2021);
        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.year);
        car2 c1=new car2(null,"",0);
        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.year);
    }
}