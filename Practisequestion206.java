import java.util.*;
public class Practisequestion206 {
    public static void main(String[] args) {
        /*Write a Java program to extract a portion of an array list.*/
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("pink");
        colors.add("orchard");
        List<String> l1=colors.subList(0,3);
        System.out.println("sublist is:");
        for(int i=0;i<3;i++){
            System.out.println(l1.get(i));
        }
    }
}
