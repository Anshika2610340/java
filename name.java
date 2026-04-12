import java.util.Scanner;
public class name{
    public static void main(String[] args){
         System.out.println("enter your name");
         String name;
         Scanner sc=new Scanner(System.in);
         name=sc.next();
         System.out.println("hello! " + name + " have a good day");
         sc.close();
    }
}

