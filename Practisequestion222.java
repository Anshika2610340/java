import java.util.*;
public class Practisequestion222 {
    public static void main(String[] args) {
        /* Write a Java program to insert elements into the linked list at the first and last positions.*/
        LinkedList<Integer> l=new LinkedList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println("original list: "+l);
        l.addFirst(5);
        l.addLast(9);
        System.out.println("list after adding in first and last: "+l);
    }
}
