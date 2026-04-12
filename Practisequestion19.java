import java.util.Scanner;
public class Practisequestion19 {
    public static void main(String[] args) {
        /*Write a Java program to check whether two String objects contain the same data. */
        Scanner input= new Scanner(System.in);
        System.out.println("enter first string");
        String str1=input.nextLine();
        System.out.println("enter second string");
        String str2=input.nextLine();
        System.out.println(str1.equals(str2));
        input.close(); 
    }
}