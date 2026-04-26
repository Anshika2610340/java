import java.util.Scanner;
public class Practisequestion118 {
    public static int transform(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
    public static void transform(String s){
        s=s.toUpperCase();
        System.out.println(s);
    }
    public static void transform(char ch){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*Define a class to overload the method transform as follows:
        int transform(int n) – to return the sum of the digits of the given number
        Example: n = 458
        output : 17
        void transform(String s) – to convert the given String to upper case and print
        Example: if S = “Blue”
        Output : BLUE
        void transform (char ch) – to print the character ch in 3 rows and 3 columns using nested loops.
        Example: if ch = ‘@’
        Output :
        @@@
        @@@
        @@@ */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of integer:");
        int n=sc.nextInt();
        System.out.println(transform(n));
        System.out.println("enter string:");
        String s=sc.next();
        transform(s);
        System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
        transform(ch);
        sc.close();
    }
}
