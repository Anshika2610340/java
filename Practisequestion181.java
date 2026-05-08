interface shape6{
    public double getarea();
    public double getperimeter();
}
class circle6 implements shape6{
    double radius;
    public circle6(double radius){
        this.radius=radius;
    }
    public double getarea(){
        return Math.PI*radius*radius;
    }
    public double getperimeter(){
        return 2*Math.PI*radius;
    }
}
class rectangle6 implements shape6{
    double length,breadth;
    public rectangle6(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getarea(){
        return length*breadth;
    }
    public double getperimeter(){
        return 2*(length+breadth);
    }
}
class triangle6 implements shape6{
    double side1,side2,side3;
    public triangle6(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getarea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getperimeter(){
        return side1+side2+side3;
    }
}
public class Practisequestion181 {
    public static void main(String[] args) {
        /*Write a Java program to create a class Shape with methods getArea() and getPerimeter().
        Create three subclasses: Circle, Rectangle, and Triangle.
        Override the getArea() and getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.*/
        circle6 c=new circle6(3.0);
        rectangle6 r=new rectangle6(2.5,3.5);
        triangle6 t=new triangle6(2,3,4);
        System.out.println(c.getarea());
        System.out.println(c.getperimeter());
        System.out.println(r.getarea());
        System.out.println(r.getperimeter());
        System.out.println(t.getarea());
        System.out.println(t.getperimeter());
    }
}
