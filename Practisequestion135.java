class cat1{
    String name;
    int age;
    public cat1(){
        name="unknown";
        age=0;
    }
}
public class Practisequestion135 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called "Cat" with instance variables name and age.
        Implement a default constructor that initializes the name to "Unknown" and the age to 0.
        Print the values of the variables. */
        cat1 c=new cat1();
        System.out.println(c.name);
        System.out.println(c.age);
    }
}