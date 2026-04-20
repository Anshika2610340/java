abstract class Shape3D {
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}
class sphere extends Shape3D{
    double radius;
    public sphere(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateVolume(){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
    @Override
    public double calculateSurfaceArea(){
        return 4*Math.PI*Math.pow(radius,2);
    }
}
class cube extends Shape3D{
    double side;
    public cube(double side){
        this.side=side;
    }
    @Override
    public double calculateVolume(){
        return Math.pow(side,3);
    }
    @Override
    public double calculateSurfaceArea(){
        return 6*Math.pow(side,2);
    }
}
public class Practisequestion157 {
    public static void main(String[] args){
        /*Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). 
        Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape. */
        sphere s=new sphere(5);
        System.out.println(s.calculateVolume());
        System.out.println(s.calculateSurfaceArea());
        cube c=new cube(4);
        System.out.println(c.calculateVolume());
        System.out.println(c.calculateSurfaceArea());
    }
}
