import java.util.Scanner;
public class Practisequestion5 {
    public static void main(String[] args) {
        /*Write a Java program that prints the current time in GMT.

        Test Data
        Input the time zone offset to GMT: 256
        Expected Output:
        Current time is 23:40:24
        */
       Scanner input= new Scanner(System.in);
       System.out.println("input the time zone offset to GMT:");
       long offset=input.nextLong();
       long milliseconds=System.currentTimeMillis();
       long totalseconds=milliseconds/1000;
       long currentsecond=totalseconds%60;
       long totalminutes=totalseconds/60;
       long currentminutes=totalminutes%60;
       long totalhours=totalminutes/60;
       long currenthours=(totalhours+offset)%24;
       System.out.println("current time is "+currenthours+":"+currentminutes+":"+currentsecond);
       input.close();
    }
}