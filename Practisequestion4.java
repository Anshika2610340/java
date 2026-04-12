import java.util.Scanner;
public class Practisequestion4 {
    public static void main (String[] args) {
        /*Write a Java program to convert minutes into years and days.

        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days */
        long minutes;
        long year,days;
        System.out.print("input the number of minutes: ");
        Scanner input = new Scanner(System.in);
        minutes = input.nextLong();
        year=minutes/525600;
        days=(minutes%525600)/1440;
        System.out.println(minutes+" is approximately "+year+" years and "+days+" days");
        input.close();
    }
}