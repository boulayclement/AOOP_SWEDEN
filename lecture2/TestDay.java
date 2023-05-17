package lecture2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestDay {
    
	@Test
	public void testAddDays() {
         Day d = new Day(2023, 4, 1);
         Day d2 = d.addDays(40);
         assertEquals(d.getYear(),d2.getYear());
         assertEquals(d.getMonth()+1,d2.getMonth());
         //assertEquals(d.getDate()+5,d2.getDate());
         
         /*...*/
    }

}
