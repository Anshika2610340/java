class animal7{
    public void eat(){
        System.out.println("eating...");
    }
    public void sound(){
        System.out.println("making sound....");
    }
}
class lion2 extends animal7{
    public void eat(){
        System.out.println("eating meat...");
    }
    public void sound(){
        System.out.println("roar roar....");
    }
}
class tiger2 extends animal7{
    public void eat(){
        System.out.println("eating meat...");
    }
    public void sound(){
        System.out.println("chuffing chuffing....");
    }
}
class panther extends animal7{
    public void eat(){
        System.out.println("eating meat...");
    }
    public void sound(){
        System.out.println("roar roar....");
    }
}
public class Practisequestion184 {
    public static void main(String[] args) {
        /*Write a Java program to create a base class Animal with methods eat() and sound().
        Create three subclasses: Lion, Tiger, and Panther.
        Override the eat() method in each subclass to describe what each animal eats.
        In addition, override the sound() method to make a specific sound for each animal.*/
        lion2 l=new lion2();
        l.eat();
        l.sound();
        tiger2 t=new tiger2();
        t.eat();
        t.sound();
        panther p=new panther();
        p.eat();
        p.sound();
    }
}
