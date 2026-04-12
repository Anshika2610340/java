import java.util.Scanner;
public class Practisequestion61 {
    public static void main(String[] args) {
        /*Define a class to accept a number from user and check if it is an EvenPal number or not.
        (The number is said to be EvenPal number when number is palindrome number (a number is palindrome if it is equal to its reverse) and sum of its digits is an even number.)
        Example: 121 – is a palindrome number
        Sum of the digits – 1+2+1 = 4 which is an even number */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int digit,rev=0,sum=0;
        int a=num;
        while(num!=0){
            digit=num%10;
            rev=rev*10+digit;
            sum=sum+digit;
            num/=10;
        }
        if(sum%2==0 && rev==a){
            System.out.println("evenpal number");
        }
        else{
            System.out.println("not a evenpal number");
        }
        sc.close();
    }
}