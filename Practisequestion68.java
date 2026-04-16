import java.util.Scanner;
public class Practisequestion68 {
    public static void main(String[] args) {
        /*Define a class to accept a number and check if the sum of the first digit and the last digit is an even number or an odd number. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int lastdigit,firstdigit;
        lastdigit=num%10;
        firstdigit=num;
        while(firstdigit>10){
            firstdigit/=10;
        }
        int sum=firstdigit+lastdigit;
        if(sum%2==0){
            System.out.println("sum is even");
        }
        else{
            System.out.println("sum is odd");
        }
        sc.close();
    }
}