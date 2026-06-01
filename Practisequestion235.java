import java.util.*;
public class Practisequestion235 {
    public static void main(String[] args) {
        /*. Write a Java program to remove and return the first element of a linked list.*/
        LinkedList<String> color=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements in list");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            color.add(sc.nextLine());
        }
        System.out.println("original list:"+color);
        System.out.println("deleted element:"+color.pop());
        System.out.println("list after deletion:"+color);
    }
}
