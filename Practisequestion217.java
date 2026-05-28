import java.util.*;
public class Practisequestion217 {
    public static void main(String[] args) {
        /* Write a Java program to append the specified element to the end of a linked list.*/
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println("list before adding at last:");
        System.out.println(l1);
        l1.addLast(6);
        System.out.println("list after adding to the last:");
        System.out.println(l1);
    }
}
