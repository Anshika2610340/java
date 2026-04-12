import java.util.Scanner;
public class Practisequestion31 {
    public static void main(String[] args) {
        /*Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character");
        String a=sc.nextLine().toLowerCase();
        if(a.length()>1){
            System.out.println("error");
        }
        else if(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
        sc.close();
    }
}