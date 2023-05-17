package lecture1;

import java.util.Date;

public class SalaryApp {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Employee woj = new Employee("Wojciech", 20000.00, new Date(2015, 4, 15));

		Date d = woj.getHireDay();
		
		d.setTime(d.getTime()-1234123234541245L);
		System.out.println(woj.getSalary(new Date(2016, 4, 1)));

	}

}