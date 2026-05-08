class vehicle2{
    public void drive(){
        System.out.println("repairing a vehicle......");
    }
}
class car3 extends vehicle2{
    @Override
    public void drive(){
        System.out.println("repairing a car.....");
    }
}
public class Practisequestion144 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Vehicle with a method called drive().
        Create a subclass called Car that overrides the drive() method to print "Repairing a car". */
        vehicle2 v=new vehicle2();
        v.drive();
        car3 c=new car3();
        c.drive();
    }
}