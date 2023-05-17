package lecture1;

import java.util.Date;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
      Date now = new Date();
      System.out.println(now);
      now.setTime(now.getTime()-3600000L);
      now.setTime(263456346545L);
      System.out.println(now.toString());
      
      Date start = new Date();
      Thread.sleep(10);
      Date end = new Date();
      System.out.println(start);
      System.out.println(end);
      System.out.println(end.getTime() - start.getTime());
      System.out.println(start.before(end));
      System.out.println(start.compareTo(end));
      
	}
	
}