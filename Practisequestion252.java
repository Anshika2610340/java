import java.util.*;
public class Practisequestion252 {
    public static void main(String[] args) {
        /*Write a Java program to compare two hash set.*/
        HashSet<String> h1=new HashSet<>();
        h1.add("pink");
        h1.add("red");
        h1.add("purple");
        System.out.println("original list h1:"+h1);
        HashSet<String> h2=new HashSet<>();
        h2.add("blue");
        h2.add("red");
        h2.add("magenta");
        System.out.println("original list h2:"+h2);
        for(String element:h1){
            System.out.println(h2.contains(element)?"yes":"no");
        }
    }
}
