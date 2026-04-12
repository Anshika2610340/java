import java.util.Scanner;
public class Practisequestion60 {
    public static void main(String[] args) {
        /*Define a class to accept a 3 digit number and check whether it is a duck number or not.
        Note: A number is a duck number if it has zero in it.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int num=a;
        int count=0;
        boolean flag=false;
        while(a!=0){
            count++;
            a/=10;
        }
        if(count>3){
            System.out.println("invalid");
        }
        else{
            while(num!=0){
                int digit=(num%10);
                if(digit==0){
                    System.out.println("duck number");
                    flag=true;
                    break;
                }
                num/=10;
            }
         if(!flag){
            System.out.println("not a duck number");
            }
        }
        sc.close();
    }
}