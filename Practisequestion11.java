import java.util.Scanner;
public class Practisequestion11 {
    public static void main(String[] args) {
        /*Write a Java program to compare two signed and unsigned numbers. */
        Scanner sc= new Scanner(System.in);
        int n1=Integer.MIN_VALUE;
        int n2=Integer.MAX_VALUE;
        System.out.println("signed integers are"+n1+","+n2);
        System.out.println("_____________________________________");
        System.out.println("comparison of signed integer"+Integer.compare(n1,n2));
        System.out.println("comparison of unsigned integer"+Integer.compareUnsigned(n1,n2));
        sc.close();
    }
}