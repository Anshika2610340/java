import java.util.*;
public class Practisequestion210 {
    public static void main(String[] args) {
        /*Write a Java program to clone an array list to another array list.*/
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(23);
        l1.add(12);
        l1.add(78);
        l1.add(67);
        ArrayList<Integer> newl1=(ArrayList<Integer>)l1.clone();
        System.out.println("cloned list:");
        for(int e:newl1){
            System.out.println(e);
        }
    }
}
