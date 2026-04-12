import java.util.Scanner;
public class Practisequestion25 {
    public static void main(String[] args) {
        /*Write a Java program to get a number from the user and print whether it is positive or negative. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n;
        n=sc.nextInt();
        if(n>=0){
            System.out.println("the number is positive");
        }
        else{
            System.out.println("the number is negative");
        }
        sc.close();
    }
}