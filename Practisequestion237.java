import java.util.*;
public class Practisequestion237 {
    public static void main(String[] args) {
        /*Write a Java program to retrieve, but not remove, the last element of a linked list.*/
        LinkedList<String> names=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of names:");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the names in the linked list:");
        for(int i=0;i<num;i++){
            names.add(sc.nextLine());
        }
        System.out.println("original list:"+names);
        System.out.println("last element in the list:"+names.peekLast());
        System.out.println("list after removing last element:"+names);
    }
}
