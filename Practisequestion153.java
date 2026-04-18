abstract class shape{
    abstract double calculatearea();
    abstract double calculateperimeter();
}
class circle extends shape{
    double radius;
    public circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculatearea(){
        return Math.PI*radius*radius;
    }
    @Override
    double calculateperimeter(){
        return 2*Math.PI*radius;
    }
}
class triangle extends shape{
    double side1,side2,side3;
    public triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    double calculatearea(){
        double s=(side1+side2+side3)/2;
        return s*(s-side1)*(s-side2)*(s-side3);
    }
    @Override
    double calculateperimeter(){
        return side1+side2+side3;
    }
}
public class Practisequestion153{
    public static void main(String[] args) {
        /*Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
        Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape. */
        circle c=new circle(5);
        triangle t=new triangle(3,4,5);
        System.out.println(c.calculatearea());
        System.out.println(c.calculateperimeter());
        System.out.println(t.calculatearea());
        System.out.println(t.calculateperimeter());
    }
}