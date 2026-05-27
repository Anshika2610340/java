import java.util.*;
public class Practisequestion213 {
    public static void main(String[] args) {
        /*Write a Java program for trimming the capacity of an array list.*/
        ArrayList<String> color1=new ArrayList<>(10);
        color1.add("white");
        color1.add("pink");
        color1.add("red");
        System.out.println("arraylist with initial capacity:");
        for(String s:color1){
            System.out.println(s);
        }
        color1.trimToSize();
        System.out.println("arrayList after reducing capacity:");
        for(String s:color1){
            System.out.println(s);
        }
    }
}
