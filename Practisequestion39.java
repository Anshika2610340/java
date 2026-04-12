import java.util.Scanner;
public class Practisequestion39 {
    public static void main(String[] args) {
        /*Write a program that encodes a word into Piglatin. To translate word into Piglatin word, convert the word into uppercase and then place the first vowel of the original word as the start of the new word along with the remaining alphabets. The alphabets present before the vowel being shifted towards the end followed by "AY".
        Sample Input 1: London
        Output: ONDONLAY
        Sample Input 2: Olympics
        Output: OLYMPICSAY */
        Scanner sc=new Scanner(System.in);
        String word,piglatin="";
        System.out.println("enter word");
        word=sc.next();
        int flag=0;
        int len=word.length();
        word=word.toUpperCase();
        for(int i=0;i<len;i++){
            char x=word.charAt(i);
            if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
                piglatin=word.substring(i)+word.substring(0,i)+"AY";
                flag=1;
                break;
            }
        }
        if(flag==0){
            piglatin=word+"AY";
        }
        System.out.println(piglatin);
        sc.close();
    }
}