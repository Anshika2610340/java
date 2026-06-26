import java.util.*;
public class Practisequestion246 {
    public static void main(String[] args) {
        /*Write a Java program to empty an hash set.*/
        HashSet<Integer> h1=new HashSet<>();
        h1.add(2);
        h1.add(3);
        h1.add(4);
        h1.add(5);
        System.out.println("list:"+h1);
        h1.removeAll(h1);
        System.out.println("list after removing all elements:"+h1);
    }
}
