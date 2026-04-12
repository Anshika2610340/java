import java.util.Scanner;
public class Practisequestion10 {
    public static void main(String[] args) {
        /*Write a Java program to break an integer into a sequence of digits.

        Test Data
        Input six non-negative digits: 123456
        Expected Output :
        1 2 3 4 5 6*/ 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer");
        int integer=sc.nextInt();
        int n1=(integer/100000)%10;
        int n2=(integer/10000)%10;
        int n3=(integer/1000)%10;
        int n4=(integer/100)%10;
        int n5=(integer/10)%10;
        int n6=integer%10;
        System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
        sc.close();
    }
}