import java.util.*;
public class Practisequestion247 {
    public static void main(String[] args) {
        /*Write a Java program to test if a hash set is empty or not.*/
        HashSet<Integer> hash=new HashSet<>();
        hash.add(46);
        hash.add(67);
        System.out.println("list"+hash);
        System.out.println("is the list empty:"+hash.isEmpty());
    }
}
