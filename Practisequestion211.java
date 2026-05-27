import java.util.*;
public class Practisequestion211 {
    public static void main(String[] args) {
        /*Write a Java program to empty an array list*/
        ArrayList<String> color=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements in color:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in color:");
        for(int i=0;i<n;i++){
            color.add(sc.nextLine());
        }
        System.out.println("list before deletion:");
        for(String s:color){
            System.out.println(s);
        }
        System.out.println("list after deletion:");
        color.removeAll(color);
        for(String s:color){
            System.out.println(s);
        }
    }
}
