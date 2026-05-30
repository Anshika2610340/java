import java.util.*;
public class Practisequestion226 {
    public static void main(String[] args) {
        /*Write a Java program to get the first and last elements in a linked list.*/
        LinkedList<String> color=new LinkedList<>();
        color.add("red");
        color.add("green");
        color.add("black");
        color.add("pink");
        color.add("orange");
        System.out.println("original list:"+color);
        System.out.println("first element in list:"+color.getFirst());
        System.out.println("last element in list:"+color.getLast());
    }
}
