import java.util.*;
public class Practisequestion200 {
    public static void main(String[] args) {
        /*Write a Java program to remove the third element from an array list.*/
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(6);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        System.out.println("arraylist before removing:");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        l1.remove(2);
        System.out.println("arraylist after removing the element:");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
