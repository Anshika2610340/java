import java.util.Scanner;
class student1{
    int studentid,grade;
    String studentname;
    public student1(){
        studentname="unknown";
        studentid=0;
        grade=0;
    }
    public student1(int g,int si,String n){
        studentname=n;
        studentid=si;
        grade=g;
    }
}
public class Practisequestion139 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
        Implement a default constructor and a parameterized constructor that takes all three instance variables.
        Use constructor chaining to initialize the variables. Print the values of the variables. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student id:");
        int si=sc.nextInt();
        System.out.println("enter grades:");
        int g=sc.nextInt();
        sc.nextLine();
        System.out.println("enter student name:");
        String n=sc.nextLine();
        student1 s=new student1();
        System.out.println(s.grade);
        System.out.println(s.studentid);
        System.out.println(s.studentname);
        student1 s1=new student1(g,si,n);
        System.out.println(s1.studentname);
        System.out.println(s1.grade);
        System.out.println(s1.studentid);
        sc.close();
    }
}