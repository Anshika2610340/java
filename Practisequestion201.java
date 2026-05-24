import java.util.*;
import java.util.Scanner;
public class Practisequestion201 {
    public static void main(String[] args) {
        /*Write a Java program to search for an element in an array list.*/
        ArrayList<String> s=new ArrayList<>();
        System.out.println("enter the no. of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        sc.nextLine();
        for(int i=0;i<n;i++){
            s.add(sc.nextLine());
        }
        System.out.println("enter the element you want to search:");
        String key=sc.nextLine();
        if(s.contains(key)){
            System.out.println("key found!");
        }
        else{
            System.out.println("key not found!");
        }
    }
}
