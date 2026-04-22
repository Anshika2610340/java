import java.util.Scanner;
public class Practisequestion110 {
    public static void check(String str,char ch){
        int count=0;
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("number of"+ch+"present is:"+count);
    }
    public static void check(String s1){
        String s=s1.toLowerCase();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i'){
                System.out.println(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        /*Design a class to overload a function check( ) as follows:
        void check (String str , char ch ) — to find and print the frequency of a character in a string.
        Example:
        Input:
        str = "success"
        ch = 's'
        Output:
        number of s present is = 3
        void check(String s1) — to display only vowels from string s1, after converting it to lower case.
        Example:
        Input:
        s1 ="computer"
        Output : o u e */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string and character:");
        String str=sc.next();
        char ch=sc.next().charAt(0);
        check(str,ch);
        System.out.println("enter string:");
        String s1=sc.next();
        check(s1);
        sc.close();
    }
}