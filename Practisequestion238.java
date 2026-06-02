import java.util.*;
public class Practisequestion238 {
    public static void main(String[] args) {
        /*Write a Java program to check if a particular element exists in a linked list.*/
        LinkedList<String> names=new LinkedList<>();
        System.out.println("enter the no.of names you want to enter:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the names in the list:");
        for(int i=0;i<no;i++){
            names.add(sc.nextLine());
        }
        System.out.println("enter the element you want to search:");
        String key=sc.nextLine();
        if(names.contains(key)){
            System.out.println(key+" found in list!");
        }
        else{
            System.out.println(key+" not found in list!");
        }
    }
}
