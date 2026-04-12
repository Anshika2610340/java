import java.util.Scanner;
public class Practisequestion51 {
    public static void main(String[] args) {
        /*Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string.
        Sample input: we are in cyber world
        Sample output: We Are In Cyber World */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String temp="";
        char word;
        int len=s.length();
        for(int i=0;i<len;i++){
            if (i==0 || s.charAt(i-1)==' '){
                word = s.charAt(i);
                temp += Character.toUpperCase(word);
            }
            else {
                word = s.charAt(i);
                temp += word;
            }
        }
        System.out.println(temp);
        sc.close();
    }
}