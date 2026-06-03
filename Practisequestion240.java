import java.util.*;
public class Practisequestion240 {
    public static void main(String[] args) {
        /*Write a Java program to compare two linked lists.*/
        LinkedList<String> c1=new LinkedList<>();
        c1.add("orange");
        c1.add("blue");
        c1.add("pink");
        c1.add("beige");
        c1.add("purple");
        LinkedList<String> c2=new LinkedList<>();
        c2.add("pink");
        c2.add("blue");
        c2.add("white");
        c2.add("purple");
        LinkedList<String> c3=new LinkedList<>();
        for(String str:c1){
            c3.add(c2.contains(str)?"yes":"no");
        }
        System.out.println("list after comparing:"+c3);
    }
}
