import java.util.Scanner;
public class Practisequestion67 {
    public static void main(String[] args) {
        /*Define a class to accept a string. Check if it is a Special String or not.
        A String is Special if the number of vowels equals to the number of consonants.
        Example: MINE
        Number of vowels = 2
        Number of Consonants = 2 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int cv=0,cc=0,len;
        len=s.length();
        s=s.toUpperCase();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                cv++;
            }
            else{
                cc++;
            }
        }
        if(cv==cc){
            System.out.println("special string");
        }
        else{
            System.out.println("not a special string");
        }
        sc.close();
    }
}