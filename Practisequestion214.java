import java.util.*;
public class Practisequestion214 {
    public static void main(String[] args) {
        /*Write a Java program to increase an array list size.*/
        ArrayList<Integer> l1=new ArrayList<>(3);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println("arraylist with initial capacity:");
        for(int i:l1){
            System.out.println(i);
        }
        l1.ensureCapacity(6);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        System.out.println("arraylist with increased capacity:");
        for(int i:l1){
            System.out.println(i);
        }
    }
}
