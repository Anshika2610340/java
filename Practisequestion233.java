import java.util.*;
public class Practisequestion233 {
    public static void main(String[] args) {
        /*Write a Java program to join two linked lists.*/
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(12);
        l1.add(23);
        l1.add(34);
        l1.add(45);
        System.out.println("original list l1:"+l1);
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(56);
        l2.add(67);
        l2.add(78);
        l2.add(89);
        System.out.println("original list l2:"+l2);
        LinkedList<Integer> l3=new LinkedList<>();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println("list after adding both the list:"+l3);
    }
}
