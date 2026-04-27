interface drawable{
    public void draw();
}
class circle3 implements drawable{
    public void draw(){
        System.out.println("drawing a circle");
    }
}
class rectangle2 implements drawable{
    public void draw(){
        System.out.println("drawing a rectangle");
    }
}
class triangle3 implements drawable{
    public void draw(){
        System.out.println("drawing a triangle");
    }
}
public class Practisequestion169 {
    static void main() {
        /*Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void.
        Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.*/
        circle3 c=new circle3();
        rectangle2 r=new rectangle2();
        triangle3 t=new triangle3();
        c.draw();
        t.draw();
        r.draw();
    }
}
