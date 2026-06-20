import java.util.*;
public class Practisequestion243 {
    public static void main(String[] args) {
        /*Write a Java program to append the specified element to the end of a hash set*/
        HashSet<Integer> h1=new HashSet<>();
        h1.add(23);
        h1.add(78);
        System.out.println("enter the element you want to add at last:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("list before adding:");
        System.out.println(h1);
        h1.add(num);
        System.out.println("list after adding:");
        System.out.println(h1);
    }
}
