import java.util.Scanner;
public class Practisequestion58 {
    public static void main(String[] args) {
        /*Define a class to accept a String and print the number of digits, alphabets and special characters in the string.
        Example:
        S = "KAPILDEV@83"
        Output:
        Number of digits – 2
        Number of Alphabets – 8
        Number of Special characters – 1 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int d=0,a=0,sch=0,w=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                d++;
            }
            else if (Character.isLetter(ch)){
                a++;
            }
            else if(Character.isWhitespace(ch)){
                w++;
            }
            else{
                sch++;
            }
        }
        System.out.println("number of digits:"+d);
        System.out.println("number of letters:"+a);
        System.out.println("number of whitespaces:"+w);
        System.out.println("number of special characters"+sch);
        sc.close();
    }
}