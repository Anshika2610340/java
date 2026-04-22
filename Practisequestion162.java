abstract class bird{
    abstract void fly();
    abstract void makesound();
}
class eagle extends bird{
    @Override
    void fly(){
        System.out.println("eagle flies high in the sky...");
    }
    @Override
    void makesound(){
        System.out.println("eagle makes a screeching sound...");
    }
}
class hawk extends bird{
    @Override
    void fly(){
        System.out.println("hawk fly high in the sky...");
    }
    @Override
    void makesound(){
        System.out.println("hawk makes a screeching sound...");
    }
}
public class Practisequestion162 {
    public static void main(String[] args){
        /*Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). 
        Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound. */
        eagle e=new eagle();
        e.fly();
        e.makesound();
        hawk h=new hawk();
        h.fly();
        h.makesound();
    }
}
