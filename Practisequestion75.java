import java.util.Scanner;

public class Practisequestion75 {
    public static void main(String[] args) {
        /*Write a program to input a sentence. Count and display the frequency of each letter of the sentence in alphabetical order. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int freq[]=new int[26];
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                int id=(int)ch-65;
                freq[id]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)(i+65)+" "+freq[i]);
            }
        }
        sc.close();
    }
}