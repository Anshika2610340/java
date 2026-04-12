import java.util.Scanner;
public class Practisequestion8 {
    public static void main(String[] args) {
        /*Write a Java program that reads a number and displays the square, cube, and fourth power.

        Expected Output:
        Square: .2f
        Cube: .2f
        Fourth power: 50625.00 */
        Scanner sc= new Scanner(System.in);
        System.out.print("input a number:");
        double number=sc.nextDouble();
        System.out.println("square:%.2f "+(number*number));
        System.out.println("cube:%.2f "+(number*number*number));
        System.out.println("fourth power:%.2f "+(number*number*number*number));
        sc.close();
    }
}