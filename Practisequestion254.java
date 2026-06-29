import java.util.*;
public class Practisequestion254 {
    public static void main(String[] args) {
        /*Write a Java program to remove all elements from a hash set.*/
        HashSet<Integer> h1=new HashSet<>();
        h1.add(23);
        h1.add(34);
        h1.add(45);
        h1.add(78);
        System.out.println("original list:"+h1);
        h1.removeAll(h1);
        System.out.println("list after removing:"+h1);
    }
}
