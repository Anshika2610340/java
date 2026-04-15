import java.util.Scanner;
public class Practisequestion66 {
    public static void main(String[] args) {
        /*Define a class to accept a number. Check if the sum of the largest digit and the smallest digit is an even number or an odd number. Print appropriate messages. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num,max,min,digit;
        num=sc.nextInt();
        max=min=(num%10);
        while(num!=0){
            digit=(num%10);
            if(digit>max){
                max=digit;
            }
            else if(digit<min){
                min=digit;
            }
            num/=10;
        }
        if((max+min)%2==0){
            System.out.println("sum is even");
        }
        else{
            System.out.println("sum is odd");
        }
        sc.close();
    }
}