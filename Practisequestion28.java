import java.util.Scanner;
public class Practisequestion28 {
    public static void main(String[] args) {
        /*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

        Test Data
        Input a number: 25
        Expected Output :
        Input value: 25
        Positive number */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        float a=sc.nextFloat();
        if(a<1){
            System.out.println("small value");
        }
        else if(a>1000000){
            System.out.println("larger value");
        }
        if(a==0){
            System.out.println("zero");
        }
        else if(a>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
        sc.close();
    }
}
