import java.util.*;
public class Practisequestion230 {
    public static void main(String[] args) {
        /*Write a Java program to remove all elements from a linked list*/
        LinkedList<Integer> l=new LinkedList<>();
        l.add(12);
        l.add(24);
        l.add(36);
        l.add(48);
        l.add(56);
        System.out.println("original list:"+l);
        l.clear();
        System.out.println("list after removing all the elements:"+l);
    }
}
