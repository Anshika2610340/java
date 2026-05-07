interface shape5{
    public double getarea();
    public double getperimeter();
}
class circle5 implements shape5{
    double radius;
    public circle5(double radius){
        this.radius=radius;
    }
    public double getarea(){
        return Math.PI*radius*radius;
    }
    public double getperimeter(){
        return 2*Math.PI*radius;
    }
}
class rectangle5 implements shape5{
    double length,breadth;
    public rectangle5(double length,double breadth){
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
class triangle5 implements shape5{
    double side1,side2,side3;
    public triangle5(double side1,double side2,double side3){
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
public class Practisequestion180 {
    public static void main(String[] args) {
        /*Write a Java program to create a class Shape with methods getArea() and getPerimeter().
        Create three subclasses: Circle, Rectangle, and Triangle.
        Override the getArea() and getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.*/
        circle5 c=new circle5(34.78);
        rectangle5 r=new rectangle5(23.89,78.89);
        triangle5 t=new triangle5(23,45,67);
        System.out.println(c.getarea());
        System.out.println(c.getperimeter());
        System.out.println(r.getarea());
        System.out.println(r.getperimeter());
        System.out.println(t.getarea());
        System.out.println(t.getperimeter());
    }
}
