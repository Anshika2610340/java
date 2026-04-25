class animal4{
    public void move(){
        System.out.println("moving.....");
    }
}
class cheetah extends animal4{
    @Override
    public void move(){
        System.out.println("cheetah moving.....");
    }
}
public class Practisequestion148 {
    public static void main(String[] args) {
        /* Write a Java program to create a class called Animal with a method named move(). 
        Create a subclass called Cheetah that overrides the move() method to run. */
        cheetah c=new cheetah();
        c.move();
    }
}
