abstract class vehicle{
    public abstract void startengine();
    public abstract void stopengine();
}
class car extends vehicle{
    @Override
    public void startengine(){
        System.out.println("car engine starting...");
    }
    @Override
    public void stopengine(){
        System.out.println("stoping car engine...");
    }
}
class motorcycle extends vehicle{
    @Override
    public void startengine(){
        System.out.println("motorcycle engine starting...");
    }
    @Override
    public void stopengine(){
        System.out.println("stoping motorcycle engine...");
    }
}
public class Practisequestion158 {
    public static void main(String[] args){
        /*Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). 
        Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type. */
        car c=new car();
        c.startengine();
        c.stopengine();
        motorcycle m=new motorcycle();
        m.startengine();
        m.stopengine();
    }
}
