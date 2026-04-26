import java.util.Scanner;
public class Practisequestion116 {
    public static void display(){
        int m=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print(m+" ");
                if(j%2==0){
                    m++;
                }
                else{
                    m--;
                }
            }
            m=1;
            System.out.println();
        }
    }
    public static void display(int n,int m){
        if(m>n){
            System.out.println(m/n);
        }
        else{
            System.out.println(3*m+2*n);
        }
    }
    public static double display(double a,double b,double c){
        double p=(a+b)/c;
        double q=a+b+c;
        double z=p*q;
        return z;
    }
    public static void main(String[] args) {
        /*Define a class to overload the method display() as follows:
        void display(): To print the following format using nested loop.
        1 2 1 2 1
        1 2 1 2 1
        1 2 1 2 1
        void display (int n, int m) : To print the quotient of the division of m and n if m is greater than n otherwise print the sum of twice n and thrice m.
        double display (double a, double b, double c) — to print the value of z where
        z=p×q
        p=a+b/c
        q=a+b+c */
        Scanner sc=new Scanner(System.in);
        display();
        System.out.println("enter the values of m and n:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        display(m,n);
        System.out.println("enter the values of a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(display(a,b,c));
        sc.close();
    }
}