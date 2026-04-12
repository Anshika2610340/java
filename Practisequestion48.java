import java.util.Scanner;
public class Practisequestion48 {
    public static void main(String[] args) {
        /*Write a program to accept a number and check and display whether it is a spy number or not. (A number is spy if the sum of its digits equals the product of its digits.)
        Example: consider the number 1124.
        Sum of the digits = 1 + 1 + 2 + 4 = 8
        Product of the digits = 1 x 1 x 2 x 4 = 8 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int sum=0;
        int product=1;
        while(a!=0){
            product*=(a%10);
            sum+=(a%10);
            a/=10;
        }
        if(product==sum){
            System.out.println("spy number");
        }
        else{
            System.out.println("not a spy number");
        }
        sc.close();
    }
}