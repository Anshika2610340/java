import java.util.Scanner;
public class Practisequestion26 {
    public static void main(String[] args) {
        /*Write a Java program to solve quadratic equations (use if, else if and else). */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int D=(b*b)-(4*a*c);
        double r1,r2;
        if (D>0){
            r1=(-b+Math.sqrt(D))/(2*a);
            r2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("the roots are " + r1+" and "+r2);
        }
        else if (D==0){
            r1=-b/(2*a);
            System.out.println("the roots are " + r1+" and "+r1);
        }
        else{
            System.out.println(((-b/(2*a)+" +i"+(Math.sqrt(-D)/(2*a))+ " and "+(-b/(2*a))+" -i "+Math.sqrt(-D)/(2*a)))); 
        }
        sc.close();
    }
}