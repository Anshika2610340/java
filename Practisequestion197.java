import java.util.*;

public class Practisequestion197 {
    public static void main(String[] args) {
        /*Write a Java program to insert an element into the array list at the first position.*/
        ArrayList<String> l1=new ArrayList<>();
        l1.add("red");
        l1.add(0,"sky blue");
        l1.add(0,"purple");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i)+" ");
        }
    }
}
