import java.util.Scanner;
public class Practisequestion37 {
    public static void main(String[] args) {
        /*Using a switch statement, write a menu driven program to:
        (a) Generate and display the first 10 terms of the Fibonacci series
        0, 1, 1, 2, 3, 5
        The first two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two.
        (b) Find the sum of the digits of an integer that is input.
        Sample Input: 15390
        Sample Output: Sum of the digits = 18
        For an incorrect choice, an appropriate error message should be displayed. */
        Scanner sc=new Scanner(System.in);
        System.out.println("choose 1 to print fibonocci series upto 10 terms");
        System.out.println("enter 2 to print sum of digits");
        System.out.println();
        System.out.println("enter choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                int a=0,b=1;
                System.out.print(a+" "+b);
                for(int i=3;i<=10;i++){
                    int term=a+b;
                    System.out.print(" "+term);
                    a=b;
                    b=term;
                }
                break;
            case 2:
                System.out.println("enter the number");
                int num=sc.nextInt();
                int sum=0;
                while(num!=0){
                    sum+=(num%10);
                    num=num/10;
                }
                System.out.println("the sum is:"+sum);
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
        sc.close();
    }
}