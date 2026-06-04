import java.util.*;
public class Practisequestion242 {
    public static void main(String[] args) {
        /*Write a Java program to replace an element in a linked list.*/
        LinkedList<String> l2=new LinkedList<>();
        l2.add("pear");
        l2.add("promagranate");
        l2.add("apple");
        System.out.println("original list:"+l2);
        l2.set(1,"mango");
        System.out.println("list after replacing:"+l2);
    }
}
