
//https://github.com/JohannesBuchner/libnova/blob/master/src/julian_day.c

public class JulianDate {
	private double jday;

	public static boolean isLeap(int year) {
		return year % 4 == 0 && year != 100 || year % 400 == 0;
	}
	private static int epochyear = 2000;
  public JulianDate() { jday = 0; }
	public JulianDate(int yyyy, int mm, int dd) {}
	public JulianDate(int yyyy, int mm, int dd, int hh, int mm, int ss) {}
	public void add(double days) { return new JulianDate(jday + days); }
	public void sub(double days) { return new JulianDate(jday - days); }
	public void sub(JulianDate d2) { return new JulianDate(jday - d2.jday); }

	public int yyyy() { return 0; }  //the year!!! 
	public int mm() { return 0; }  //the month
	public int dd() { return 0; }  //the year!!!
	public String toString() {
		return yyyy() + "-" + mm() + "-" + date ;
	}
}


public class TestJulianDate {

	// check 2/28 feb 28th border case
	//2/29 border case only exists in leap year
	// 3/1 border case
	
	
	public static void testYear(int y) {
		for (int m = 1; m <= 12; m++) {
			for (int d = 1; d <= 32; d++) {
				JulianDate d = new JulianDate(y, m, d);
				System.out.println(d);
			}			
	}
	
	public static void main(String[] args) {
		JulianDate d = new JulianDate(); // if so, what is jday?

		JulianDate d2 = d.add(3); // d2 is 3 days after
		JulianDate d3 = d2.sub(1); // d3 subtract 1 day
		
		System.out.println(d2.sub(d1)); // difference between two days

		JuliandDate d4 = new JulianDate(2009, 1, 3, 12, 00, 00);
		System.out.println(d4.sub(d3)); // difference between two days
		//0.16 days = 1 hour?
		JuliandDate d5 = new JulianDate(2018, 4, 3, 00, 00, 00);
		//		JulianDate d6 = d4.add(d5);
		//		JulianDate d6 = d4.mult(3);
		System.out.println(d5); // 2018-04-03 00:00:00
		JuliandDate d6 = new JulianDate(2018, 4, 4, 00, 00, 00);
		JuliandDate d7 = new JulianDate(2018, 4, 5, 00, 00, 00);
		testYear(2020);
		testYear(1900);
		testYear(2000);

	}
}
