abstract class geometricshape{
    abstract double area();
    abstract double perimeter();
}
class triangle extends geometricshape{
    double side1,side2,side3;
    public triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    double area(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    double perimeter(){
        return side1+side2+side3;
    }
}
class square extends geometricshape{
    double side;
    public square(double side){
        this.side=side;
    }
    @Override
    double area(){
        return side*side;
    }
    @Override
    double perimeter(){
        return 4*side;
    }
}
public class Practisequestion163 {
    public static void main(String[] args){
        /*Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). 
        Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape. */
        triangle t=new triangle(3,4,5);
        System.out.println(t.area());
        System.out.println(t.perimeter());
        square s=new square(4);
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
