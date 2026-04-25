interface shape{
    double getarea();
}
class rectangle implements shape{
    double length,breadth;
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getarea(){
        return length*breadth;
    }
}
class circle implements shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    public double getarea(){
        return 3.14*radius*radius;
    }
}
class triangle implements shape{
    double base,height;
    triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double getarea(){
        return 0.5*base*height;
    }
}
public class Practisequestion164 {
    public static void main(String[] args){
        /*Write a Java program to create an interface Shape with the getArea() method. 
        Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
        Implement the getArea() method for each of the three classes. */
        rectangle r=new rectangle(5,10);
        circle c=new circle(5);
        triangle t=new triangle(5,10);
        System.out.println("area of rectangle is:"+r.getarea());
        System.out.println("area of circle is:"+c.getarea());
        System.out.println("area of triangle is:"+t.getarea());
    }
}
