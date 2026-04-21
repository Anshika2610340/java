import java.util.Scanner;
public class Practisequestion105 {
    public static void series(double n){
        double sum1=0;
        for(int i=1;i<=n;i++){
            sum1+=(1.0/i);
        }
        System.out.println(sum1);
    }
    public static void series(double a,double n){
        int x=1;
        double sum2=0;
        for(int i=1;i<=n;i++){
            sum2+=(x/Math.pow(a,x+1));
            x+=3;
        }
        System.out.println(sum2);
    }
    public static void main(String[] args) {
        /*Design a class to overload a function series( ) as follows:
        double series(double n) with one double argument and returns the sum of the series.
        sum = (1/1) + (1/2) + (1/3) + .......... + (1/n)
        double series(double a, double n) with two double arguments and returns the sum of the series.
        sum = (1/a2) + (4/a5) + (7/a8) + (10/a11) + .......... to n terms */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer:");
        double n=sc.nextDouble();
        series(n);
        System.out.println("enter integers:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        series(a,b);
        sc.close();
    }
}