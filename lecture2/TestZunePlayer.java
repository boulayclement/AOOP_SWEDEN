package lecture2;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

public class TestZunePlayer {

	@Ignore
	@Test
	public void testCurrentDaysToYear() {
		ZunePlayer zp;
		int days;
		zp = new ZunePlayer();
		for(int i=0; i<200;i++) {
			days = i*365+100;
			zp.currentDaysToYear(days);
			assertEquals(zp.getYear(), 1980+i);
		}
	}

	@Test(timeout=10000)
	public void testCurrentDaysToYearRandom() {
		Random r = new Random();
		ZunePlayer zp = new ZunePlayer();
		for(int i=0; i<1000000; i++) {
			int days = r.nextInt(40*365);
			zp.currentDaysToYear(days);
			assertEquals(zp.getYear(), 1980+days/365, 1.0);
		}
	}
	
}
