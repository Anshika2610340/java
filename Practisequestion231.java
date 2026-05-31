import java.util.*;
public class Practisequestion231 {
    public static void main(String[] args) {
        /*Write a Java program that swaps two elements in a linked list.*/
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the no.of elements in linked list:");
        int number=sc.nextInt();
        System.out.println("enter the elements in list:");
        for(int i=0;i<number;i++){
            l.add(sc.nextInt());
        }
        System.out.println("original list:"+l);
        System.out.println("enter the indexes which you want to swap:");
        int ind1=sc.nextInt();
        int ind2=sc.nextInt();
        Collections.swap(l,ind1,ind2);
        System.out.println("list after swapping:"+l);
    }
}
