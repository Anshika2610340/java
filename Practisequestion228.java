import java.util.*;
public class Practisequestion228 {
    public static void main(String[] args) {
        /*Write a Java program to remove a specified element from a linked list.*/
        LinkedList<String> color=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of inputs in list:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in list:");
        for(int i=0;i<n;i++){
            color.add(sc.nextLine());
        }
        System.out.println("original list:"+color);
        System.out.println("enter the value of index which you want to delete:");
        int ind=sc.nextInt();
        color.remove(ind);
        System.out.println("list after removing:"+color);
    }
}
