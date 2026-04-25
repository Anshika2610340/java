abstract class animal1{
    abstract void eat();
    abstract void sleep();
}
class lion1 extends animal1{
    @Override
    void eat(){
        System.out.println("lions eat meat");
    }
    @Override
    void sleep(){
        System.out.println("lions sleep in a day");
    }
}
class tiger1 extends animal1{
    @Override
    void eat(){
        System.out.println("tigers eat meat");
    }
    @Override
    void sleep(){
        System.out.println("tigers sleep in a day");
    }
}
class deer1 extends animal1{
    @Override
    void eat(){
        System.out.println("deers eat grass");
    }
    @Override
    void sleep(){
        System.out.println("deers sleep in a day");
    }
}
public class Practisequestion155 {
    public static void main(String[] args){
        /*Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). 
        Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior. */
        lion1 l=new lion1();
        tiger1 t=new tiger1();
        deer1 d=new deer1();
        l.eat();
        l.sleep();
        t.eat();
        t.sleep();
        d.eat();
        d.sleep();
    }
}