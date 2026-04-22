import java.util.Scanner;
public class Practisequestion109 {
    public static void sumseries(int n,double x){
        double sum=0;
        for(int i=1;i<=n;i++){
            double term=i*x;
            if(i%2==0){
                sum-=term;
            }
            else{
                sum+=term;
            }
        }
        System.out.println("sum:"+sum);
    }
    public static void sumseries(){
        int sum=0,term=1;
        for(int i=1;i<=20;i++){
            term*=i;
            sum+=term;
        }
        System.out.println("sum:"+sum);
    }
    public static void main(String[] args) {
        /*Design a class to overload a function sumSeries() as follows:
        (i) void sumSeries(int n, double x): with one integer argument and one double argument to find and display the sum of the series given below:
        s= 1x − 2x + 3x− 4x+ 5x... ... ... to n terms
        (ii) void sumSeries(): to find and display the sum of the following series:
        s=1+(1×2)+(1×2×3)+... ... ... +(1×2×3×4... ... ... ×20) */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer and double values:");
        int a=sc.nextInt();
        double b=sc.nextDouble();
        sumseries(a,b);
        sumseries();
        sc.close();
    }
}