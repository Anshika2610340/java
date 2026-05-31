import java.util.*;
public class Practisequestion229 {
    public static void main(String[] args) {
        /* Write a Java program to remove the first and last elements from a linked list.*/
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of elements in linked list:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println("original list:"+l);
        l.removeFirst();
        l.removeLast();
        System.out.println("list after removing first and last element:"+l);
    }
}
