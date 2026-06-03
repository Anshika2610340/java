import java.util.*;
public class Practisequestion239 {
    public static void main(String[] args) {
        /*Write a Java program to convert a linked list to an array list.*/
        LinkedList<String> color=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of elements in linked list:");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in the linked list:");
        for(int i=0;i<num;i++){
            color.add(sc.nextLine());
        }
        System.out.println("original list:"+color);
        List<String> list=new ArrayList<String>(color);
        System.out.println("ArrayList after conversion:");
        for(String str:list){
            System.out.println(str);
        }
    }
}
