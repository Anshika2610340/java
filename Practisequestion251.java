import java.util.*;
public class Practisequestion251 {
    public static void main(String[] args) {
        /*Write a Java program to find numbers less than 7 in a tree set.*/
        HashSet<Integer> h1=new HashSet<>();
        h1.add(99);
        h1.add(5);
        h1.add(2);
        h1.add(50);
        System.out.println("original list:"+h1);
        Set<Integer> treeset=new TreeSet<>(h1);
        for(int a:treeset){
            if(a<7){
                System.out.println(a);
            }
        }
    }
}
