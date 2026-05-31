import java.util.*;
public class Practisequestion227 {
    public static void main(String[] args) {
        /* Write a Java program to display elements and their positions in a linked list.*/
        LinkedList<String> color=new LinkedList<>();
        color.add("beige");
        color.add("red");
        color.add("emerald");
        color.add("lavender");
        color.add("indigo");
        for(int i=0;i<color.size();i++){
            System.out.println("index:"+i+" color:"+color.get(i));
        }
    }
}
