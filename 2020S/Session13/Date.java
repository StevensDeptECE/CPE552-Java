/**
 *https://www.dreamincode.net/forums/topic/44237-julian-date-calculator/
 * @author dkruger
 */
public class Date implements java.io.Serializable {
    private int jday;
    private Date(int jday) {
        this.jday = jday;
    }
    private String[] weekdays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private final static int epochYear = 2000; // day 0 = Jan.1, 2000
    private final static int epochWeekday = 6;
    public Date(int year, int mon, int day) {
        int dy = year - epochYear;
        boolean leapYear = dy % 4 == 0 && dy % 100 == 0 && dy % 400 == 0;
        jday = 365 * dy + dy/4 - dy/100 + dy / 400;
        // add leap day from this year if needed
        //added months and days
    }
    public Date() { jday = 0; }

    public void setDate(int jd) {
        this.jday = jd;
    }
    public int getDate() {
        return jday;
    }
    
    public int getYear() {
                return 0;
    }
    public void setYear(int y) {
        
    }
    
    public int getMonth() {
                return 0;
    }
    public void setMonth(int m) {
        
    }
    
    public int getDay() {
        return 0;        
    }
    
    public void setDay(int d) {
        
    }
    
    public int getDayOfWeek() {
        return (epochWeekday + jday) % 7;
    }
    
    public Date add(int days) {
        return new Date(jday + days);
    }
    public int numberOfDaysTo(Date d) {
        return d.jday - jday;
    }
}
