package BuildJavaPrograms.Chapter_10_ArrayList.DateTime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CalendarDateMain {

    public static void main(String[] args) {
        ArrayList<CalendarDate> dates = new ArrayList<>();
        dates.add(new CalendarDate(2,22));
        dates.add(new CalendarDate(10,22));
        dates.add(new CalendarDate(4,18));
        dates.add(new CalendarDate(1,8));

        System.out.println("before sort birthdays = " + dates);
        Collections.sort(dates);
        System.out.println("after sort birthdays = " + dates);
    }
}
