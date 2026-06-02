import java.util.*;
public class Practisequestion236 {
    public static void main(String[] args) {
        /* Write a Java program to retrieve, but not remove, the first element of a linked list.*/
        LinkedList<String> color =new LinkedList<>();
        System.out.println("enter the no. of elements in the list:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in the list:");
        for(int i=0;i<n;i++){
            color.add(sc.nextLine());
        }
        System.out.println("original list:"+color);
        System.out.println("first element of the list:"+color.peekFirst());
        System.out.println("list after showing first element:"+color);
    }
}
