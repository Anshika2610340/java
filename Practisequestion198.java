import java.util.*;
import java.util.Scanner;
public class Practisequestion198 {
    public static void main(String[] args) {
        /*Write a Java program to retrieve an element (at a specified index) from a given array list.*/
        ArrayList<String> color=new ArrayList<>();
        System.out.println("enter the no of elements to be added in the arraylist");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in arraylist");
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            color.add(s);
        }
        System.out.println("enter the index at which you want to see the color");
        int ind=sc.nextInt();
        try{
            System.out.println(color.get(ind));
        }
        catch(Exception e){
            System.out.println("some exception occured");
        }
    }
}
