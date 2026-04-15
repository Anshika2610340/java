import java.util.Scanner;
public class Practisequestion64 {
    public static void main(String[] args) {
        /*Define a class to accept a number and check whether it is a SUPERSPY number or not. 
        A number is called SUPERSPY if the sum of the digits equals the number of the digits. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int c=0,temp,sum=0,digit;
        temp=num;
        while(num!=0){
            c++;
            num/=10;
        }
        num=temp;
        while(temp!=0){
            digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        if(sum==c){
            System.out.println("superspy number");
        }
        else{
            System.out.println("not a superspy number");
        }
        sc.close();
    }
}