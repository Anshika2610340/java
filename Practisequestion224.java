import java.util.*;
public class Practisequestion224 {
    public static void main(String[] args) {
        /* Write a Java program to insert the specified element at the end of a linked list.*/
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements in linked list:");
        int n=sc.nextInt();
        System.out.println("enter the elements in linked list:");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println("original list: "+l);
        System.out.println("enter the element you want in last position:");
        int value=sc.nextInt();
        l.addLast(value);
        System.out.println("list after adding in last position: "+l);
    }
}
