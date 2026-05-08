import java.util.Scanner;
class shape8{
    public double getarea(){
        return 0.0;
    }
}
class rectangle9 extends shape8{
    double length;
    double width;
    public rectangle9(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getarea(){
        return length*width;
    }
}
public class Practisequestion145 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Shape with a method called getArea().
        Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        double length=sc.nextDouble();
        System.out.println("enter width:");
        double width=sc.nextDouble();
        rectangle9 r=new rectangle9(length,width);
        System.out.println(r.getarea());
        sc.close();
    }
}