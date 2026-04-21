abstract class instrument{
    abstract void play();
    abstract void tune();
}
class glockenspiel extends instrument{
    @Override
    void play(){
        System.out.println("glockenspiel playing music...");
    }
    @Override
    void tune(){
        System.out.println("tuning a glockspiel...");
    }
}
class violin extends instrument{
    @Override
    void play(){
        System.out.println("violin is playing...");
    }
    @Override
    void tune(){
        System.out.println("tuning a violin...");
    }
}
public class Practisequestion160 {
    public static void main(String[] args){
        /* Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). 
        Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument. */
        glockenspiel g=new glockenspiel();
        g.play();
        g.tune();
        violin v=new violin();
        v.play();
        v.tune();
    }
}