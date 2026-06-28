import java.util.*;
public class Practisequestion250 {
    public static void main(String[] args) {
        /*Write a Java program to convert a hash set to a tree set.*/
        HashSet<Integer> h1=new HashSet<>();
        h1.add(12);
        h1.add(23);
        h1.add(34);
        System.out.println("list:"+h1);
        Set<Integer> treeset=new TreeSet<>(h1);
        for(int a:treeset){
            System.out.println(a);
        }
    }
}
