import java.util.Scanner;
public class Practisequestion108 {
    public void joystick(String s, char ch1, char ch2){
        String s1=s.replace(ch1,ch2);
        System.out.println(s1);
    }
    public void joystick(String s){
        int f=s.indexOf(" ");
        int l=s.lastIndexOf(" ");
        System.out.println("first index:"+f);
        System.out.println("last index:"+l);
    }
    public void joystick(String s1,String s2){
        System.out.println(s1.concat(" ").concat(s2));
    }
    public static void main(String[] args) {
        /*Design a class to overload a function Joystring( ) as follows:
        void Joystring(String s, char ch1, char ch2) with one string argument and two character arguments that replaces the character argument ch1 with the character argument ch2 in the given String s and prints the new string.
        Example:
        Input value of s = "TECHNALAGY"
        ch1 = 'A'
        ch2 = 'O'
        Output: "TECHNOLOGY"
        void Joystring(String s) with one string argument that prints the position of the first space and the last space of the given String s.
        Example:
        Input value of s = "Cloud computing means Internet based computing"
        Output:
        First index: 5
        Last Index: 36
        void Joystring(String s1, String s2) with two string arguments that combines the two strings with a space between them and prints the resultant string.
        Example:
        Input value of s1 = "COMMON WEALTH"
        Input value of s2 = "GAMES"
        Output: COMMON WEALTH GAMES */
        Practisequestion108 obj=new Practisequestion108();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string,char1,char2:");
        String s=sc.next();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        sc.nextLine(); 
        obj.joystick(s,ch1,ch2);
        System.out.println("enter string:");
        String s1=sc.nextLine();
        obj.joystick(s1);
        System.out.println("enter strings:");
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        obj.joystick(s2,s3);
        sc.close();
    }
}