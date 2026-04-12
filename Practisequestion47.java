import java.util.Scanner;
public class Practisequestion47 {
    public static void main(String[] args) {
        /*Write a program to accept a number and check and display whether it is a Niven number or not.
        (Niven number is that number which is divisible by its sum of digits.). */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num!=0){
            sum+=(num%10);
            num/=10;
        }
        if(temp%sum==0){
            System.out.println("niven number");
        }
        else{
            System.out.println("not a niven number");
        }
        sc.close();
    }
}