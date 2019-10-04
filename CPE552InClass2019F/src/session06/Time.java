package session06;

/**
 *
 * @author dkruger
 */
public class Time {
    private int t;
    public Time(int hour, int minute, int second) {
       t = hour  * 60*60 + minute * 60 + second;  
    }
    public Time() {
       this(15,0,0); 
        //t = 15*60*60;
    }
    public String toString() {
        int h = t / 3600;
        int m = t % 3600 / 60;
        int s = t % 60;
        String hh = h + "";
        if (h < 10)
            hh = "0" + h;
        return (h < 10 ? "0" + h : "" + h) + ":" +
                (m < 10 ? "0" + m : "" + m) + ":" +
                (s < 10 ? "0" + s : "" + s);
    }
    public int diff(Time b) {
        // alternate way to do it by storing h,m,s
        //return h * 3600 + m * 60 + s - b.h * 3600 - b.m*60 - b.s;
        return this.t - b.t;
    }
    public static void main(String[] args) {
        Time a = new Time(15,10,30);
        Time b = new Time(); // 15:00:00
        System.out.println(a);
        System.out.println(a.diff(b));
    }
}
