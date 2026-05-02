interface animal3{
    public void sound();
}
class bird1 implements animal3{
    public void sound(){
        System.out.println("chirping....");
    }
}
class cat implements animal3{
    public void sound(){
        System.out.println("meow meow....");
    }
}
public class Practisequestion175 {
    static void main() {
        /* Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
        Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal*/
        bird1 b=new bird1();
        cat c=new cat();
        b.sound();
        c.sound();
    }
}
