import java.util.Scanner;
public class Practisequestion24 {
    public static void main(String[] args) {
        /*Write a Java program to check whether a given string starts with another string. */
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=input.nextLine();
        System.out.println("enter the prefix");
        String str2=input.nextLine();
        System.out.println(str1.startsWith(str2));
        input.close();
    }
}