package lecture2;

public class ZunePlayer {
	private int year = 0;
	
	public int getYear() {
		return year;
	}
	
	public void currentDaysToYear(int days) {
	    year = 1980;
	    while (days > 365) {
	        if (isLeapYear()) {
	            if (days > 366) {
	                days -= 366; year++;
	            }else{
	            	break;
	            }
	        } else {
	            days -= 365; year++;
	        }
	    }
	}
	
	private boolean isLeapYear() {
		return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
	}
	
	public static void main(String[] args) {
		ZunePlayer zp = new ZunePlayer();
		zp.currentDaysToYear(12343);
		System.out.println("The year is " + zp.getYear() + ".");
	}
}
