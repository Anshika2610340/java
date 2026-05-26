import java.util.*;
public class Practisequestion208 {
    public static void main(String[] args) {
        /*Write a Java program that swaps two elements in an array list.*/
        ArrayList<String> color=new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("white");
        color.add("blue");
        System.out.println("list before swapping:");
        for(String e:color){
            System.out.println(e);
        }
        Collections.swap(color,0,2);
        System.out.println("list after swapping:");
        for(String e:color){
            System.out.println(e);
        }
    }
}
