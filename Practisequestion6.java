import java.util.Scanner;
public class Practisequestion6 {
    public static void main(String[] args) {
        /* writ a java program to calculate the body mass index(BMI)
        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.30159143458721 */
        Scanner input = new Scanner(System.in);
        System.out.println("input height in inches:");
        double height=input.nextDouble();
        System.out.println("input weight in pounds:");
        double weight=input.nextDouble();
        double bmi=(weight*703)/(height*height);
        System.out.println("body mass index is "+bmi);
        input.close();
    }
}