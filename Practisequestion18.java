import java.util.Scanner;
public class Practisequestion18 {
    public static void main(String[] args) {
        /*Write a Java program to compare a given string to the specified character sequence. */
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first string");
        String str1=sc.nextLine();
        System.out.println("enter second string");
        String str2=sc.nextLine();
        System.out.println(str1.contentEquals(str2));
        sc.close();
    }
}