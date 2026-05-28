import java.util.*;
public class Practisequestion218 {
    public static void main(String[] args) {
        /*Write a Java program to iterate through all elements in a linked list.*/
        LinkedList<Integer> l1=new LinkedList<>();
        System.out.println("enter the no.of elements in the linked list");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println("iterating the list:");
        for(int e:l1){
            System.out.println(e);
        }
    }
}
