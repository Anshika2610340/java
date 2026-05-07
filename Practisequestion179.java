class sports{
    public void play(){
        System.out.println("playing...");
    }
}
class football2 extends sports{
    public void play(){
        System.out.println("playing football....");
    }
}
class basketball2 extends sports{
    public void play(){
        System.out.println("playing basketball....");
    }
}
class rugby extends sports{
    public void play(){
        System.out.println("playing rugby....");
    }
}
public class Practisequestion179 {
    public static void main(String[] args) {
        /*Write a Java program to create a base class Sports with a method called play().
        Create three subclasses: Football, Basketball, and Rugby.
        Override the play() method in each subclass to play a specific statement for each sport.*/
        football2 f=new football2();
        basketball2 b=new basketball2();
        rugby r=new rugby();
        f.play();
        b.play();
        r.play();
    }
}
