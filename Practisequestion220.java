import java.util.*;
public class Practisequestion220 {
    public static void main(String[] args) {
        /*Write a Java program to iterate a linked list in reverse order.*/
        LinkedList<String> color=new LinkedList<>();
        color.add("orange");
        color.add("pink");
        color.add("blue");
        color.add("green");
        System.out.println("original list:"+color);
        Iterator t=color.descendingIterator();
        System.out.println("list in reverse order:");
        while(t.hasNext()){
            System.out.println(t.next());
        }
    }
}
