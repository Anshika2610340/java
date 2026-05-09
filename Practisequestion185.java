interface vehicle3{
    public void startengine();
    public void stopengine();
}
class car4 implements vehicle3{
    public void startengine(){
        System.out.println("starting the engine of the car");
    }
    public void stopengine(){
        System.out.println("stopping the engine of the car");
    }
}
class motorcycle1 implements vehicle3{
    public void startengine(){
        System.out.println("starting the engine of the motorcycle");
    }
    public void stopengine(){
        System.out.println("stopping the engine of the motorcycle");
    }
}
public class Practisequestion185 {
    public static void main(String[] args) {
        /*Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
        Create two subclasses Car and Motorcycle.
        Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.*/
        car4 c=new car4();
        c.startengine();
        c.stopengine();
        motorcycle1 m=new motorcycle1();
        m.startengine();
        m.stopengine();
    }
}
