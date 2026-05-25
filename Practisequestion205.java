import java.util.*;
public class Practisequestion205 {
    public static void main(String[] args) {
        /*Write a Java program to reverse elements in an array list.*/
        ArrayList<String> vibrant=new ArrayList<>();
        System.out.println("enter the no. of elements in vibrant:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            vibrant.add(sc.nextLine());
        }
        System.out.println("list before reversing:");
        for(int i=0;i<vibrant.size();i++){
            System.out.println(vibrant.get(i));
        }
        Collections.reverse(vibrant);
        System.out.println("list after reversing:");
        for(int i=0;i<vibrant.size();i++){
            System.out.println(vibrant.get(i));
        }
    }
}
