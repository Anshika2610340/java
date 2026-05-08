class animal5{
    public void move(){
        System.out.println("moving....");
    }
    public void makesound(){
        System.out.println("making sound....");
    }
}
class bird2 extends animal5{
    public void move(){
        System.out.println("bird is moving...");
    }
    public void makesound(){
        System.out.println("chirping....");
    }
}
class panthera extends animal5{
    public void move(){
        System.out.println("panthera is moving...");
    }
    public void makesound(){
        System.out.println("roaring....");
    }
}
public class Practisequestion182 {
    public static void main(String[] args) {
        /*Write a Java program to create a base class Animal with methods move() and makeSound().
        Create two subclasses Bird and Panthera.
        Override the move() method in each subclass to describe how each animal moves.
        Also, override the makeSound() method in each subclass to make a specific sound for each animal.*/
        bird2 b=new bird2();
        b.move();
        b.makesound();
        panthera p=new panthera();
        p.move();
        p.makesound();
    }
}
