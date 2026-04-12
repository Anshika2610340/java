import java.util.Scanner;
public class Practisequestion1 {
    
    public static void main(String[] args) {
            /*Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
            Test Data
            Input a degree in Fahrenheit: 212
            Expected Output:
            212.0 degree Fahrenheit is equal to 100.0 in Celsius*/
            double farenheit;
            double Celsius;
            System.out.print("Input a degree in farenheit:");
            Scanner sc = new Scanner(System.in);
            farenheit = sc.nextDouble();
            Celsius = (farenheit - 32) * (5.0 / 9.0);
            System.out.println(farenheit+" degree Fahrenheit is equal to "+Celsius+" in Celsius");
            sc.close();
    }
}

