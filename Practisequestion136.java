import java.util.Scanner;
class dog1{
    String name;
    String color;
    public dog1(String n,String colour){
        name=n;
        color=colour;
    }
}
public class Practisequestion136 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Dog with instance variables name and color.
        Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
        Print the values of the variables. */
        Scanner sc=new Scanner(System.in);
        String s,c;
        System.out.println("enter the name of dog:");
        s=sc.nextLine();
        System.out.println("enter the color of the dog:");
        c=sc.nextLine();
        dog1 d=new dog1(s,c);
        System.out.println(d.name);
        System.out.println(d.color);
        sc.close();
    }
}