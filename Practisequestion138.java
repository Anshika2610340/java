import java.util.Scanner;
class rectangle8{
    int length,width;
    public rectangle8(int l,int w){
        length=l;
        width=w;
    }
    public rectangle8(rectangle8 rectangle8){
        length=rectangle8.length;
        width=rectangle8.width;
    }
}
public class Practisequestion138 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Rectangle with instance variables length and width.
        Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object.
        Print the values of the variables. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and width:");
        int l=sc.nextInt();
        int w=sc.nextInt();
        rectangle8 r1=new rectangle8(l,w);
        System.out.println("length:"+r1.length);
        System.out.println("width:"+r1.width);
        rectangle8 r2=new rectangle8(r1);
        System.out.println("length:"+r2.length);
        System.out.println("width:"+r2.width);
        sc.close();
    }
}