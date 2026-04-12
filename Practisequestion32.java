import java.util.Scanner;
public class Practisequestion32 {
    public static void main(String[] args) {
        /*Write a Java program that takes a year from the user and prints whether it is a leap year or not. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        if (year%400==0 || (year%100!=0 && year%4==0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
        sc.close();
    }
}