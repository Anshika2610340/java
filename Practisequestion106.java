import java.util.Scanner;
public class Practisequestion106 {
    public static double area (double a ,double b,double c){
        double s=(a+b+c)/2;
        double ar=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(ar);
        return area;
    }
    public static double area(int a,int b, int hieght){
        double area=(1.0/2.0)*hieght*(a+b);
        return area;
    }
    public static double area(double dia1,double dia2){
        double area=(1.0/2.0)*(dia1*dia2);
        return area;
    }
    public static void main(String[] args) {
        /*Design a class to overload a function area( ) as follows:
        double area (double a, double b, double c) with three double arguments, returns the area of a scalene triangle using the formula:
        area = √(s(s-a)(s-b)(s-c))
        where s = (a+b+c) / 2
        double area (int a, int b, int height) with three integer arguments, returns the area of a trapezium using the formula:
        area = (1/2)height(a + b)
        double area (double diagonal1, double diagonal2) with two double arguments, returns the area of a rhombus using the formula:
        area = 1/2(diagonal1 x diagonal2) */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(area(a,b,c));
        System.out.println("enter a,b,height");
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int height=sc.nextInt();
        System.out.println(area(a1,b1,height));
        System.out.println("enter diagonals:");
        double dia1=sc.nextDouble();
        double dia2=sc.nextDouble();
        System.out.println(area(dia1,dia2));
        sc.close();
    }
}