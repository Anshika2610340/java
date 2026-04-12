import java.util.Scanner;
public class Practisequestion56 {
    public static void main(String[] args) {
        /*Define a class to accept a string, and print the characters with the uppercase and lowercase reversed, but all the other characters should remain the same as before.
        EXAMPLE:
        INPUT : WelCoMe_2022
        OUTPUT : wELcOmE_2022 */
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int len=s.length();
        String rev="";
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    rev+=Character.toLowerCase(ch);
                }
                else{
                    rev+=Character.toUpperCase(ch);
                }
            }
            else{
                rev+=ch;
            }
        }
        System.out.println(rev);
        sc.close();
    }
}