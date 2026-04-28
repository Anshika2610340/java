interface playable{
    public void play();
}
class football implements playable{
    public void play(){
        System.out.println("playing football...");
    }
}
class volleyball implements playable{
    public void play(){
        System.out.println("playing volleyball...");
    }
}
class basketball implements playable{
    public void play(){
        System.out.println("playing basketball...");
    }
}
public class Practisequestion171 {
    static void main() {
        /*Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
        Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.*/
        football f=new football();
        volleyball v=new volleyball();
        basketball b=new basketball();
        f.play();
        v.play();
        b.play();
    }
}
