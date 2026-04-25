interface animal{
    void bark();
}
class  dog implements animal{
    public void bark(){
        System.out.println("dog is barking...");
    }
}
public class Practisequestion165 {
    public static void main(String[] args){
        /*Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. 
        Create a Dog class that implements Animal and overrides bark() to print "Dog is barking". */
        dog d=new dog();
        d.bark();
    }
}
