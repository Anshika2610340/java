import java.util.Scanner;
public class Practisequestion65 {
    public static void main(String[] args) {
        /*Define a class to accept a String and print if it is a Super String or not. A String is Super if the number of uppercase letters are equal to the number of lowercase letters. [Use Character and String methods only]
        Example: “COmmITmeNt”
        Number of uppercase letters = 5
        Number of lowercase letters = 5
        String is a Super String */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int cu=0,cl=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                cu++;
            }
            else if(Character.isLowerCase(ch)){
                cl++;
            }
            else{
                continue;
            }
        }
        if(cl==cu){
            System.out.println("super string");
        }
        else{
            System.out.println("not a super string");
        }
        sc.close();
    }
}