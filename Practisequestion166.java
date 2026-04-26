interface flyable{
    public void fly_obj();
}
class spacecraft implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("flying spacecraft...");
    }
}
class airplane implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("flying airplane...");
    }
}
class helicopter implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("flying helicopter...");
    }
}
public class Practisequestion166 {
    static void main() {
        /*Write a Java program to create an interface Flyable with a method called fly_obj().
        Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
        Implement the fly_obj() method for each of the three classes.*/
        spacecraft s=new spacecraft();
        s.fly_obj();
        airplane a=new airplane();
        a.fly_obj();
        helicopter h=new helicopter();
        h.fly_obj();
    }
}
