import java.util.*;
public class Practisequestion216 {
    public static void main(String[] args) {
        /*Write a Java program to print all the elements of an ArrayList using the elements' position.*/
        ArrayList<String> color=new ArrayList<>();
        color.add("white");
        color.add("red");
        color.add("blue");
        System.out.println("initial array:"+color);
        System.out.println("arrayList with index:");
        for(int i=0;i<color.size();i++){
            System.out.println("index:"+i+" element:"+color.get(i));
        }
    }
}
