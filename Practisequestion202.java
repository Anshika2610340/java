import java.util.*;
import java.util.Scanner;
public class Practisequestion202 {
    public static void main(String[] args) {
        /*Write a Java program to sort a given array list*/
        ArrayList<String> l1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements in the list:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            l1.add(sc.nextLine());
        }
        System.out.println("arraylist before sorting:");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        Collections.sort(l1);
        System.out.println("Arraylist after sorting:");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
