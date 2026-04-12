import java.util.Scanner;
public class Practisequestion2 {
    public static void main(String[] args) {
        /*Write a Java program that reads a number in inches and converts it to meters.
        Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters
 */
        float inche;
        float meters;
        System.out.print("input a value for inche:");
        Scanner sc = new Scanner(System.in);
        inche = sc.nextFloat();
        meters = inche * 0.0254f;
        System.out.println(inche + " inch is " + meters + " meters");
        sc.close();
    }
}
