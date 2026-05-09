interface shape9{
    public void draw();
    public double calculatearea();
}
class circle9 implements shape9{
    double radius;
    public circle9(double radius){
        this.radius=radius;
    }
    public void draw(){
        System.out.println("drawing a circle....");
    }
    public double calculatearea(){
        return Math.PI*radius*radius;
    }
}
class cylinder implements shape9{
    double radius,hieght;
    public cylinder(double radius,double hieght){
        this.radius=radius;
        this.hieght=hieght;
    }
    public void draw(){
        System.out.println("drawing a cylinder....");
    }
    public double calculatearea(){
        return (2*Math.PI*radius*hieght)+(2*Math.PI*radius*radius);
    }
}
public class Practisequestion186 {
    public static void main(String[] args) {
        /*Write a Java program to create a base class Shape with methods draw() and calculateArea().
        Create two subclasses Circle and Cylinder.
        Override the draw() method in each subclass to draw the respective shape.
        In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.*/
        circle9 c=new circle9(3.14);
        c.draw();
        System.out.println(c.calculatearea());
        cylinder c1=new cylinder(2,3);
        c1.draw();
        System.out.println(c1.calculatearea());
    }
}
