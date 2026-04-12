import java.util.Scanner;
public class Practisequestion54 {
    public static void main(String[] args) {
        /*Write a program to input a sentence and convert it into uppercase and count and display the total number of words starting with a letter 'A'. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int c=0;
        if(s.length()>0 && s.charAt(0)=='A'){
            c++;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='A' && s.charAt(i-1)==' '){
                c++;
            }
        }
        System.out.println("count of words:"+c);
        sc.close();
    }
}