class shape7{
    double length,breadth;
    public void draw(){
        System.out.println("drawing...");
    }
    public void calculatearea(){
        double area=length*breadth;
    }
}
class circle7 extends shape7{
    double radius;
    public circle7(double radius){
        this.radius=radius;
    }
    public void draw(){
        System.out.println("drawing a circle...");
    }
    public void calculatearea(){
        double area=Math.PI*radius*radius;
        System.out.println(area);
    }
}
class square7 extends shape7{
    double side;
    public square7(double side){
        this.side=side;
    }
    public void draw(){
        System.out.println("drawing a square...");
    }
    public void calculatearea(){
        double area=side*side;
        System.out.println(area);
    }
}
class triangle7 extends shape7{
    double side1,side2,side3;
    public triangle7(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public void draw(){
        System.out.println("drawing a triangle...");
    }
    public void calculatearea(){
        double s=(side1+side2+side3)/2;
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area);
    }
}
public class Practisequestion183 {
    public static void main(String[] args) {
        /*Write a Java program to create a base class Shape with methods draw() and calculateArea().
        Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape,
        and override the calculateArea() method to calculate and return the area of each shape.*/
        circle7 c=new circle7(2);
        c.draw();
        c.calculatearea();
        square7 s=new square7(2);
        s.draw();
        s.calculatearea();
        triangle7 t=new triangle7(2,3,4);
        t.draw();
        t.calculatearea();
    }
}
