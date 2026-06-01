import java.util.*;
public class Practisequestion234 {
    public static void main(String[] args) {
        /*Write a Java program to copy a linked list to another linked list.*/
        LinkedList<String> color=new LinkedList<>();
        color.add("white");
        color.add("pink");
        color.add("yellow");
        color.add("blue");
        System.out.println("original list:"+color);
        LinkedList<String> copy1=(LinkedList)color.clone();
        System.out.println("copy of the list:"+copy1);
    }
}
