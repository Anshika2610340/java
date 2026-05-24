import java.util.*;
import java.util.Scanner;

public class Practisequestion199 {
    public static void main(String[] args) {
        /*Write a Java program to update an array element by the given element.*/
        ArrayList<String> color1 = new ArrayList<>();
        System.out.println("enter the no of elements to be added in the arraylist");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in arraylist");
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            color1.add(s);
        }
        for (int i = 0; i < color1.size(); i++) {
            System.out.println(color1.get(i));
        }
        System.out.println("enter the index at which you want to replace:");
        try{
            int ind = sc.nextInt();
            System.out.println("enter the value you want to set:");
            sc.nextLine();
            String s1 = sc.nextLine();
            color1.set(ind, s1);
        }
        catch(Exception e){
            System.out.println("some exception occured");
        }
        for (int i = 0; i < color1.size(); i++) {
            System.out.println(color1.get(i));
        }
    }
}
