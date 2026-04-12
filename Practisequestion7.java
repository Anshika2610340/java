import java.util.Scanner;
public class Practisequestion7 {
    public static void main(String[] args) {
        /*Write a Java program to take the user for a distance (in meters) and the time taken
        (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, 
        kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). 
        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531
        Your speed in km/h is 0.42089513
        Your speed in miles/h is 0.26158804*/
        Scanner input = new Scanner(System.in);
        System.out.print("input distance in meters:");
        float distance=input.nextFloat();
        System.out.print("input hours:");
        int hours=input.nextInt();
        System.out.print("input minutes:");
        int minutes=input.nextInt();
        System.out.print("input seconds:");
        int seconds=input.nextInt();
        float mps=distance/((hours*3600)+(minutes*60)+seconds);
        float kmph=(distance/1000)/(hours+(minutes/60f)+(seconds/3600f));
        float milesph=(distance/1609f)/(hours+(minutes/60f)+(seconds/3600f));
        System.out.println("your speed in meters/second is "+mps);
        System.out.println("your speed in km/h is "+kmph);
        System.out.println("your speed in miles/h is "+milesph);
        input.close();
    }
}