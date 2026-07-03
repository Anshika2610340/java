import java.util.Calendar;
public class Practisequestion255 {
    public static void main(String[] args) {
        /*Create a instance of calendar class and test its methods*/
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
    }
}
