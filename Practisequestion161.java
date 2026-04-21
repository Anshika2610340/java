abstract class shape2d{
    abstract void draw();
    abstract void resize();
}
class rectangle extends shape2d{
    @Override
    void draw(){
        System.out.println("drawing a rectangle...");
    }
    @Override
    void resize(){
        System.out.println("resizing a rectangle...");
    }
}
class circle extends shape2d{
    @Override
    void draw(){
        System.out.println("drawing a circle...");
    }
    @Override
    void resize(){
        System.out.println("resizing a circle...");
    }
}
public class Practisequestion161 {
    public static void main(String[] args){
        /*Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). 
        Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape. */
        rectangle r=new rectangle();
        r.draw();
        r.resize();
        circle c=new circle();
        c.draw();
        c.resize();
    }
}
