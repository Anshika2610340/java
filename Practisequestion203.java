import java.util.*;
import java.util.Scanner;
public class Practisequestion203 {
    public static void main(String[] args) {
        /*Write a Java program to copy one array list into another.*/
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        System.out.println("enter the no.of elements in l1 and l2:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter elements in l1:");
        for(int i=0;i<n1;i++){
            l1.add(sc.nextInt());
        }
        System.out.println("enter elements in l2:");
        for(int i=0;i<n2;i++){
            l2.add(sc.nextInt());
        }
        if(n1!=n2){
            System.out.println("copying is not posiible!");
            return;
        }
        else{
            System.out.println("before copying:");
            System.out.println("list l1:");
            for(int i=0;i<n1;i++){
                System.out.println(l1.get(i));
            }
            System.out.println("list l2:");
            for(int i=0;i<n2;i++){
                System.out.println(l2.get(i));
            }
            Collections.copy(l1,l2);
            System.out.println("after copying:");
            System.out.println("list l1:");
            for(int i=0;i<n1;i++){
                System.out.println(l1.get(i));
            }
            System.out.println("list l2:");
            for(int i=0;i<n2;i++){
                System.out.println(l2.get(i));
            }
        }
    }
}
