import java.util.Scanner;
public class Practisequestion103 {
    public void compare(int a,int b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    public void compare(char a,char b){
        int x=(int)a;
        int y=(int)b;
        if(x>y){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    public void compare(String a,String b){
        int x=a.length();
        int y=b.length();
        if(x>y){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        /*Design a class to overload a function compare( ) as follows:
        void compare(int, int) — to compare two integers values and print the greater of the two integers.
        void compare(char, char) — to compare the numeric value of two characters and print with the higher numeric value.
        void compare(String, String) — to compare the length of the two strings and print the longer of the two. */
        Scanner sc=new Scanner(System.in);
        Practisequestion103 obj=new Practisequestion103();
        System.out.println("enter the integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.compare(a,b);
        System.out.println("enter characters");
        char a1=sc.next().charAt(0);
        char b1=sc.next().charAt(0);
        obj.compare(a1,b1);
        System.out.println("enter strings:");
        String a3=sc.next();
        String b3=sc.next();
        obj.compare(a3,b3);
        sc.close();
    }
}