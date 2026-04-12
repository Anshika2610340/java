import java.util.Calendar;
public class Practisequestion20 {
    public static void main(String[] args) {
        /*Write a Java program to print the current date and time in the specified format. */
        Calendar c= Calendar.getInstance();
        System.out.format("%tB %te %tY%n",c,c,c);
        System.out.format("%tl:%tM %tp%n",c,c,c);
    }
}