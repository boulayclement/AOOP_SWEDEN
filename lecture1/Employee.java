package lecture1;

import java.util.Date;

public class Employee {

	public Employee(String n, double s, Date hd) {
		name = n;
		salary = s;
		hireDay = hd;
	}

	public String getName() {
		return name;
	}

	public double getSalary(Date d) {
		long inc = d.getTime() - hireDay.getTime();
		// Convert ms to days
		long days = (inc/1000/60/60/24);
		return salary + days;
	}

	public Date getHireDay() {
		return hireDay;
	}

	private String name;
	private double salary;
	private Date hireDay;
}