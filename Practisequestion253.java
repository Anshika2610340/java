import java.util.*;
public class Practisequestion253 {
    public static void main(String[] args) {
        /*Write a Java program to compare two sets and retain elements that are the same.*/
        HashSet<String> h1=new HashSet<>();
        h1.add("pink");
        h1.add("blue");
        h1.add("black");
        System.out.println("list h1:"+h1);
        HashSet<String> h2=new HashSet<>();
        h2.add("pink");
        h2.add("green");
        h2.add("blue");
        System.out.println("list h2:"+h2);
        h1.retainAll(h2);
        System.out.println(h1);
    }
}
