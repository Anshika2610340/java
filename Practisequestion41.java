import java.util.Scanner;
public class Practisequestion41{
    public static void main(String[] args) {
        /*A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result is equal to the original two-digit number.
        Example: Consider the number 59.
        Sum of digits = 5 + 9 = 14
        Product of digits = 5 * 9 = 45
        Sum of the sum of digits and product of digits = 14 + 45 = 59
        Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits. If the value is equal to the number input, then display the message "Special two—digit number" otherwise, display the message "Not a special two-digit number". */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num,p=1,sum=0,sp,temp;
        num=sc.nextInt();
        temp=num;
        while(num!=0){
            p*=(num%10);
            sum+=(num%10);
            num/=10;
        }
        sp=p+sum;
        if(sp==temp){
            System.out.println("special number");
        }
        else{
            System.out.println("not a special number");
        }
        sc.close();
    }
}