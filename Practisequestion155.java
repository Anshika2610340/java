abstract class animal{
    abstract void eat();
    abstract void sleep();
}
class lion extends animal{
    @Override
    void eat(){
        System.out.println("lions eat meat");
    }
    @Override
    void sleep(){
        System.out.println("lions sleep in a day");
    }
}
class tiger extends animal{
    @Override
    void eat(){
        System.out.println("tigers eat meat");
    }
    @Override
    void sleep(){
        System.out.println("tigers sleep in a day");
    }
}
class deer extends animal{
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
        lion l=new lion();
        tiger t=new tiger();
        deer d=new deer();
        l.eat();
        l.sleep();
        t.eat();
        t.sleep();
        d.eat();
        d.sleep();
    }
}