package lecture1;

import java.util.*;

public class TestDate {

	public static void main(String[] args) {
		Day d1 = new Day(2023,3,20);
		Day d2 = new Day(2023,3,22);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d2.daysFrom(d1));
		System.out.println(d1.addDays(1000000000));
		
	
	}

}