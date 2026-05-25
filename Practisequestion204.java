import java.util.*;
public class Practisequestion204 {
    public static void main(String[] args) {
        /*Write a Java program to shuffle elements in an array list.*/
        ArrayList<String> colors=new ArrayList<>();
        System.out.println("enter the no of elements in color:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements in colors:");
        for(int i=0;i<n;i++){
            colors.add(sc.nextLine());
        }
        System.out.println("list before shuffling:");
        for(int i=0;i<n;i++){
            System.out.println(colors.get(i));
        }
        Collections.shuffle(colors);
        System.out.println("list after shuffling:");
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }
}
