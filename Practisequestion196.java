import java.util.*;
public class Practisequestion196 {
    public static void main(String[] args) {
        /*Write a Java program to create an array list, add some colors (strings) and print out the collection.*/
        ArrayList<String> l1=new ArrayList<>();
        l1.add("red");
        l1.add("yellow");
        l1.add("blue");
        l1.add("green");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
