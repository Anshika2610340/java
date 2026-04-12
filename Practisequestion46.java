import java.util.Scanner;
public class Practisequestion46 {
    public static void main(String[] args) {
        /*Special words are those words which start and end with the same letter.
        Example: EXISTENCE, COMIC, WINDOW
        Palindrome words are those words which read the same from left to right and vice-versa.
        Example: MALYALAM, MADAM, LEVEL, ROTATOR, CIVIC
        All palindromes are special words but all special words are not palindromes.
        Write a program to accept a word. Check and display whether the word is a palindrome or only a special word or none of them. */
        Scanner input=new Scanner(System.in);
        System.out.println("enter string");
        String s=input.next();
        s=s.toUpperCase();
        int len=s.length();
        boolean ispalin=true;
        boolean isspecial=false;
        if(s.charAt(0)==s.charAt(len-1)){
            isspecial=true;
        }
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                ispalin=false;
                break;
            }
        }
        if(isspecial && ispalin){
            System.out.println("special and palindrome");
        }
        else if(ispalin){
            System.out.println("palindrome");
        }
        else if(isspecial){
            System.out.println("special");
        }
        else{
            System.out.println("not palindrome and not special");
        }
        input.close();
    }
}