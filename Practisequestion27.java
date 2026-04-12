import java.util.Scanner;
public class Practisequestion27 {
    public static void main(String[] args) {
        /*Write a Java program that takes three numbers from the user and prints the greatest number. */
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
        sc.close();
    }
}