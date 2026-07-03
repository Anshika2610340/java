import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Practisequestion256 {
    public static void main(String[] args) {
        /*Create an instance of gregorian calendar and check its methods*/
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2026));
        System.out.println(TimeZone.getAvailableIDs()[0]);
    }
}
