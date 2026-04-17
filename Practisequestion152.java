abstract class animal{
    abstract public void sound();
}
class lion extends animal{
    @Override
    public void sound(){
        System.out.println("The lion roars....");
    }
}
class tiger extends animal{
    @Override
    public void sound(){
        System.out.println("the tigers growls...");
    }
}
public class Practisequestion152{
    public static void main(String[] args) {
        /* Write a Java program to create an abstract class Animal with an abstract method called sound(). 
        Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal. */
        lion l=new lion();
        tiger t=new tiger();
        l.sound();
        t.sound();
    }
}