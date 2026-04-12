import java.util.Scanner;
public class Practisequestion9 {
    public static void main(String[] args) {
        /*Write a Java program that accepts two integers from the user and prints the sum, the difference, 
        the product, the average, the distance (the difference between the integers), the maximum 
        (the largest of the two integers), and the minimum (the smallest of the two integers).

        Test Data
        Input 1st integer: 25
        Input 2nd integer: 5
        Expected Output :
        Sum of two integers: 30
        Difference of two integers: 20
        Product of two integers: 125
        Average of two integers: 15.00
        Distance of two integers: 20
        Max integer: 25
        Min integer: 5 */
        Scanner sc=new Scanner(System.in);
        System.out.println("input 1st integer:");
        int number1= sc.nextInt();
        System.out.println("input 2nd number:");
        int number2=sc.nextInt();
        System.out.println("sum of two integers:"+(number1+number2));
        System.out.println("difference of two integers:"+(number1-number2));
        System.out.println("product of two integers:"+(number1*number2));
        System.out.println("average of two integers:"+(float)(number1+number2)/2);
        System.out.println("distance of two integers:"+(number1-number2));
        System.out.println("max integer:"+java.lang.Math.max(number1,number2));
        System.out.println("min integer:"+java.lang.Math.min(number1,number2));
        sc.close();
    }
}