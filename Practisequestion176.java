class vehicle1{
    int speed1;
    public int speedup(int speed){
        speed1+=speed;
        return speed;
    }
}
class car1 extends vehicle1{
    int speed;
    public car1(int speed){
        this.speed=speed;
    }
    public int speedup(int s){
        speed+=s;
        return speed;
    }
}
class bicycle extends vehicle1{
    int speed;
    public bicycle(int speed){
        this.speed=speed;
    }
    public int speedup(int s){
        speed+=s;
        return speed;
    }
}
public class Practisequestion176 {
    static void main() {
        /*Write a Java program to create a class Vehicle with a method called speedUp().
        Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.*/
        car1 c=new car1(23);
        System.out.println(c.speedup(22));
        bicycle b=new bicycle(34);
        System.out.println(b.speedup(3));
    }
}
