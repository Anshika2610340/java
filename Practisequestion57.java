import java.util.Scanner;
public class Practisequestion57 {
    public static void main(String[] args) {
        /*Define a class to accept two strings of same length and form a new word in such a way that, the first character of the first word is followed by the first character of the second word and so on.
        Example :
        Input string 1 – BALL
        Input string 2 – WORD
        OUTPUT : BWAOLRLD */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.next();
        System.out.println("enter second string");
        String s2=sc.next();
        int len=s1.length();
        String s="";
        if(s2.length()==len){
            for (int i=0;i<len;i++){
                s+=s1.charAt(i);
                s+=s2.charAt(i);
            }
        }
        else{
            System.out.println("strings length should be same");
        }
        System.out.println(s);
        sc.close();
    }
}