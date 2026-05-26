import java.util.*;
public class Practisequestion209 {
    public static void main(String[] args) {
        /*Write a Java program to join two array lists.*/
        ArrayList<String> a=new ArrayList<>();
        a.add("red");
        a.add("white");
        a.add("green");
        a.add("blue");
        ArrayList<String> b=new ArrayList<>();
        b.add("pink");
        b.add("orange");
        ArrayList<String> c=new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        System.out.println("list after joining:");
        for(String e:c){
            System.out.println(e);
        }
    }
}
