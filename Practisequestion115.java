import java.util.Scanner;
public class Practisequestion115 {
    public static double perform(double r,double h){
        double l=Math.sqrt(r*r+h*h);
        double csa=Math.PI*r*l;
        return csa;
    }
    public static void perform(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void perform(int m,int n, char ch){
        if(ch=='q'||ch=='Q'){
            System.out.println(m/n);
        }
        else if(ch=='r'|| ch=='R'){
            System.out.println(m%n);
        }
    }
    public static void main(String[] args){
        /*Define a class to overload the method perform as follows:
        double perform (double r, double h) — to calculate and return the value of curved surface area of cone
        CSA=πrl
        CSA=πrl
        l= r 2 +h 2
        void perform (int r, int c) — Use NESTED FOR LOOP to generate the following format
        r = 4, c = 5
        output
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        void perform (int m, int n, char ch) — to print the quotient of the division of m and n if ch is Q else print the remainder of the division of m and n if ch is R */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r and h:");
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println(perform(r,h));
        System.out.println("enter the values of r and c:");
        int r1=sc.nextInt();
        int c=sc.nextInt();
        perform(r1,c);
        System.out.println("enter the values of m,n,character:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        perform(m,n,ch);
        sc.close();
    }
}