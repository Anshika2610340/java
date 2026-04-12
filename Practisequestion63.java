import java.util.Scanner;
public class Practisequestion63 {
    public static void main(String[] args) {
        /*Define a class to accept a string and convert the same to uppercase, create and display the new string by replacing each vowel by immediate next character and every consonant by the previous character. The other characters remain the same.
        Example:
        Input : #IMAGINATION@2024
        Output : #JLBFJMBSJPM@2024 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        a=a.toUpperCase();
        String res="";
        int len=a.length();
        for(int i=0;i<len;i++){
            char ch=a.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                res+=(char)(ch+1);
            }
            else if(Character.isLetter(ch)){
                res+=(char)(ch-1);
            }
            else{
                res+=ch;
            }
        }
        System.out.println(res);
        sc.close();
    }
}