abstract class person{
    abstract void eat();
    abstract void exercise();
}
class athelete extends person{
    @Override
    void eat(){
        System.out.println("athelete eats healthy food...");
    }
    @Override
    void exercise(){
        System.out.println("atheletes exercise daily...");
    }
}
class lazyperson extends person{
    @Override
    void eat(){
        System.out.println("lazy person eats junk food...");
    }
    @Override
    void exercise(){
        System.out.println("lazy person don't exercise...");
    }
}
public class Practisequestion159 {
    public static void main(String[] args){
        /*Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). 
        Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises. */
        athelete a=new athelete();
        a.eat();
        a.exercise();
        lazyperson l=new lazyperson();
        l.eat();
        l.exercise();
    }
}
