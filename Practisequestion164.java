interface shape2{
    double getarea();
}
class rectangle implements shape2{
    double length,breadth;
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getarea(){
        return length*breadth;
    }
}
class circle1 implements shape2{
    double radius;
    circle1(double radius){
        this.radius=radius;
    }
    public double getarea(){
        return 3.14*radius*radius;
    }
}
class triangle2 implements shape2{
    double base,height;
    triangle2(double base,double height){
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
        circle1 c=new circle1(5);
        triangle2 t=new triangle2(5,10);
        System.out.println("area of rectangle is:"+r.getarea());
        System.out.println("area of circle is:"+c.getarea());
        System.out.println("area of triangle is:"+t.getarea());
    }
}
