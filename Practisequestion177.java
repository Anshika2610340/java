class shape4{
    double length,breadth;
    public double calculatearea(){
        return length*breadth;
    }
}
class circle4 extends shape4{
    double radius;
    public circle4(double radius){
        this.radius=radius;
    }
    public double calculatearea(){
        return Math.PI*radius*radius;
    }
}
class rectangle3 extends shape4{
    double length,breadth;
    public rectangle3(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calculatearea(){
        return length*breadth;
    }
}
class triangle4 extends shape4{
    double base,height;
    public triangle4(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double calculatearea(){
        return 0.5*base*height;
    }
}
public class Practisequestion177 {
    public static void main(String[] args) {
        /*Write a Java program to create a base class Shape with a method called calculateArea().
        Create three subclasses: Circle, Rectangle, and Triangle.
        Override the calculateArea() method in each subclass to calculate and return the shape's area.*/
        circle4 c=new circle4(23.89);
        rectangle3 r=new rectangle3(34.89,90);
        triangle4 t=new triangle4(2,3);
        System.out.println(c.calculatearea());
        System.out.println(r.calculatearea());
        System.out.println(t.calculatearea());
    }
}
