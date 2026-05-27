import java.util.*;
public class Practisequestion215 {
    public static void main(String[] args) {
        /*Write a Java program to replace the second element of an ArrayList with the specified element.*/
        ArrayList<String> color=new ArrayList<>();
        color.add("white");
        color.add("red");
        System.out.println("initial arraylist:");
        for(int i=0;i<color.size();i++){
            System.out.println(color.get(i));
        }
        color.set(1,"black");
        System.out.println("arraylist after replacing:");
        for(String i:color){
            System.out.println(i);
        }
    }
}
