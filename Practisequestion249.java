import java.util.*;
public class Practisequestion249 {
    public static void main(String[] args) {
        /*Write a Java program to convert a hash set to an array.*/
        HashSet<Integer> h = new HashSet<>();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        System.out.println("original list:"+h);
        h.toArray();
        System.out.println("list after converting into array:");
        for(int a:h){
            System.out.println(a);
        }
    }
}
