import java.util.*;
public class Practisequestion221 {
    public static void main(String[] args) {
        /*Write a Java program to insert the specified element at the specified position in the linked list.*/
        LinkedList<String> l=new LinkedList<>();
        System.out.println("enter the no.of elements in linked list:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in linked list:");
        for(int i=0;i<n;i++){
            l.add(sc.nextLine());
        }
        System.out.println("original list:");
        System.out.println(l);
        System.out.println("enter the index at whish you want to add:");
        int ind=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the value:");
        String val=sc.nextLine();
        l.add(ind,val);
        System.out.println("list after adding:");
        System.out.println(l);
    }
}
