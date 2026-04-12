import java.util.Scanner;
public class Practisequestion13 {
    public static void main(String[] args) {
        /*Write a Java program to get the character at the given index within the string. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String input= sc.nextLine();
        System.out.println("enter index");
        int index=sc.nextInt();
        System.out.println(input.charAt(index));
        sc.close();
    }
}