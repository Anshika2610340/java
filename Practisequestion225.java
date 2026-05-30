import java.util.*;
public class Practisequestion225 {
    public static void main(String[] args) {
        /*Write a Java program to insert some elements at the specified position into a linked list.*/
        LinkedList<String> color=new LinkedList<>();
        color.add("navy blue");
        color.add("mustard");
        color.add("dusty yellow");
        color.add("neon");
        System.out.println("original list:"+color);
        color.add(2,"black");
        System.out.println("list after adding in specific position:"+color);
    }
}
