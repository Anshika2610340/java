import java.util.Scanner;
public class Practisequestion112 {
    public static void series(int x,int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(x,i);
        }
        System.out.println("sum:"+sum);
    }
    public static void series(int p){
        for(int i=1;i<=p;i++){
            int term=(int)(Math.pow(i,3)-1);
            System.out.println(term+" ");
        }
    }
    public static void series(){
        double sum=0.0;
        for(int i=2;i<=10;i++){
            sum+=(1.0/i);
        }
        System.out.println("sum:"+sum);
    }
    public static void main(String[] args) {
        /*Design a class to overload a function series( ) as follows:
        (a) void series (int x, int n) – To display the sum of the series given below:
        x1 + x2 + x3 + .......... xn terms
        (b) void series (int p) – To display the following series:
        0, 7, 26, 63 .......... p terms
        (c) void series () – To display the sum of the series given below:
        1/2 + 1/3 + 1/4 + .......... 1/10*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        series(a,b);
        System.out.println("enter integer:");
        int c=sc.nextInt();
        series(c);
        series();
        sc.close();
    }
}