import java.util.*;
public class Practisequestion232 {
    public static void main(String[] args) {
        /*Write a Java program to shuffle elements in a linked list.*/
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of elements in list:");
        int num=sc.nextInt();
        System.out.println("enter the values in list:");
        for(int i=0;i<num;i++){
            l.add(sc.nextInt());
        }
        System.out.println("original list:"+l);
        Collections.shuffle(l);
        System.out.println("list after shuffling:"+l);
    }
}
