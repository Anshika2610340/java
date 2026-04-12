import java.util.Scanner;
public class Practisequestion44 {
    public static void main(String[] args) {
        /*Using switch statement, write a menu driven program to:
        (i) To find and display all the factors of a number input by the user ( including 1 and the excluding the number itself).
        Example:
        Sample Input : n = 15
        Sample Output : 1, 3, 5
        (ii) To find and display the factorial of a number input by the user (the factorial of a non-negative integer n, denoted by n!, is the product of all integers less than or equal to n.)
        Example:
        Sample Input : n = 5
        Sample Output : 5! = 1*2*3*4*5 = 120
        For an incorrect choice, an appropriate error message should be displayed. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for factors");
        System.out.println("enter 2 for factorial");
        System.out.println();
        System.out.println("enter choice");
        int ch;
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("enter a number");
                int num1;
                num1=sc.nextInt();
                for(int i=1;i<num1;i++){
                    if(num1%i==0){
                       System.out.print(i+" ");
                    }
                }
                break;
            case 2:
                System.out.println("enter a number");
                int num2;
                num2=sc.nextInt();
                int f=1;
                for (int i=1;i<=num2;i++){
                    f*=i;
                }
                System.out.println("factorial is:"+f);
                break;
            default:
                System.out.println("invalid choice");
        }
        sc.close();
    }
}