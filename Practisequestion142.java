import java.util.Scanner;
class classroom{
    String classname;
    String[] students;
    public classroom(String n,String[] str){
        classname=n;
        students=str;
    }
}
public class Practisequestion142{
    public static void main(String[] args) {
        /*Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
        Implement a parameterized constructor that initializes these variables.
        Print the values of the variables */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter classname:");
        String n=sc.nextLine();
        System.out.println("enter the no. of students:");
        int n1=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the list of students:");
        String[] str=new String[n1];
        for(int i=0;i<n1;i++){
            str[i]=sc.nextLine();
        }
        classroom c=new classroom(n,str);
        System.out.println(c.classname);
        for(int i=0;i<n1;i++){
            System.out.println(c.students[i]);
        }
        sc.close();
    }
}