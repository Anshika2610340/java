import java.util.Scanner;
public class Practisequestion111 {
    public static double volume(double r){
        double v;
        v=(4.0/3.0)*(22.0/7.0)*r*r*r;
        return v;
    }
    public static double volume(double h,double r){
        double v=(22.0/7.0)*r*r*h;
        return v;
    }
    public static double volume(double l,double b,double h){
        double v=l*b*h;
        return v;
    }
    public static void main(String[] args) {
        /*Design a class to overload a function volume() as follows:
        double volume (double R) – with radius (R) as an argument, returns the volume of sphere using the formula.
        V = 4/3 x 22/7 x R3
        double volume (double H, double R) – with height(H) and radius(R) as the arguments, returns the volume of a cylinder using the formula.
        V = 22/7 x R2 x H
        double volume (double L, double B, double H) – with length(L), breadth(B) and Height(H) as the arguments, returns the volume of a cuboid using the formula.
        V = L x B x H */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        double r=sc.nextDouble();
        System.out.println(volume(r));
        System.out.println("enter hieght and radius:");
        double h=sc.nextDouble();
        double r1=sc.nextDouble();
        System.out.println(volume(h,r1));
        System.out.println("enter length,breadth and hieght:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h1=sc.nextDouble();
        System.out.println(volume(l,b,h1));
        sc.close();
    }
}