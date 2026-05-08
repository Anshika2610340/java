class animal6{
    public void makesound(){
        System.out.println("making sound.....");
    }
}
class cat2 extends animal6{
    @Override
    public void makesound(){
        System.out.println("meow meow.....");
    }
}
public class Practisequestion143 {
    public static void main(String[] args) {
        /* Write a Java program to create a class called Animal with a method called makeSound().
        Create a subclass called Cat that overrides the makeSound() method to bark. */
        animal6 a=new animal6();
        a.makesound();
        cat2 c=new cat2();
        c.makesound();
    }
}