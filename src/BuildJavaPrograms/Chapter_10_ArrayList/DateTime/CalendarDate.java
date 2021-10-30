package BuildJavaPrograms.Chapter_10_ArrayList.DateTime;

public class CalendarDate implements  Comparable<CalendarDate> {

    private int month;
    private int day;

    public CalendarDate(int month, int day) {
        this.day = day;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return month + "/" + day;
    }

    @Override
    public int compareTo(CalendarDate other) {
        if (month != other.month) {
            return month - other.month;
        } else {
            return day - other.day;
        }
    }
}
