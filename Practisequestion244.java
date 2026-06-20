import java.util.HashSet;
import java.util.Iterator;

public class Practisequestion244 {
    public static void main(String[] args) {
        /*Write a Java program to iterate through all elements in a hash list.*/
        HashSet<String> h1=new HashSet<>();
        h1.add("yellow");
        h1.add("brown");
        h1.add("pink");
        h1.add("blue");
        Iterator<String> p=h1.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
