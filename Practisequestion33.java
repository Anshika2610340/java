import java.util.Scanner;
public class Practisequestion33 {
    public static void main(String[] args) {
        /*Write a program to accept a word and convert it into lower case, if it is in upper case. Display the new word by replacing only the vowels with the letter following it.
        Sample Input: computer
        Sample Output: cpmpvtfr */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String str1=sc.next();
        str1=str1.toLowerCase();
        String str2="";
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                char newchar=(char) (ch+1);
                str2=str2+newchar;
            }
            else{
                str2=str2+ch;
            }
        }
        System.out.println(str2);
        sc.close();
    }
}