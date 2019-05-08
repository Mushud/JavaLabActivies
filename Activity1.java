import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Activity1
 */
public class Activity1 {

    public static void main(String[] args) {
        displayDate(11);
        displayDate(9, 24);
        displayDate(05, 1, 2018);
    }

    public static void displayDate(int month, int day, int year) {
        Calendar calender = new GregorianCalendar(year, month-1, day);
        System.out.println(calender.getTime());
    }

    public static void displayDate(int month, int day) {
        displayDate(month, day, 2014);
    }

    public static void displayDate(int month) {
        displayDate(month, 01);
    }
}