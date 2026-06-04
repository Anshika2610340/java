import java.util.*;
public class Practisequestion241 {
    public static void main(String[] args) {
        /*Write a Java program to check if a linked list is empty or not.*/
        LinkedList<String> l1=new LinkedList<>();
        l1.add("grapes");
        l1.add("pear");
        l1.add("papaya");
        l1.add("apple");
        System.out.println("original list:"+l1);
        System.out.println("list is empty or not:"+l1.isEmpty());
        l1.removeAll(l1);
        System.out.println("list after removing all elements:"+l1);
        System.out.println("list is empty or not:"+l1.isEmpty());
    }
}
