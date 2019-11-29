package web;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.data.redis.samples.retwisj.web.WebUtils;

public class WebUtilsTest {

	@Test
	public void testTimeInWordsNow() {
		long time = System.currentTimeMillis();
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.now", retour);
	}

	@Test
	public void testTimeInWordsFewSeconds() {

		long time = System.currentTimeMillis() - 5000;
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.now", retour);
	}

	@Test
	public void testTimeInWordsTenSeconds() {
		long time = System.currentTimeMillis() - 10000;
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.minute.less", retour);
	}

	@Test
	public void testTimeInWordsMinuteLess() {
		long time = System.currentTimeMillis() - 30000;
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.minute.less", retour);
	}

	@Test
	public void testTimeInWordsMinute() {
		long time = System.currentTimeMillis() - 60000;
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.minute", retour);
	}

	@Test
	public void testTimeInWordsMinuteAndHalf() {
		long time = System.currentTimeMillis() - 90000;
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.minute", retour);
	}
	
	@Test
	public void testTimeInWordsMinuteAndForty() {
		long time = System.currentTimeMillis() - 100000;
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.minute", retour);
	}

	@Test
	public void testTimeInWordsTwoMinutes() {
		long time = System.currentTimeMillis() - 120000;
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.minutes#2", retour);
	}

	@Test
	public void testTimeInWordsFewMinutes() {
		long time = System.currentTimeMillis() - (60 * 30 * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.minutes#30", retour);
	}

	@Test
	public void testTimeInWordsFortyFiveMinutes() {
		long time = System.currentTimeMillis() - (60 * 45 * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.hour", retour);
	}

	@Test
	public void testTimeInWordsHour() {
		long time = System.currentTimeMillis() - (60 * 60 * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.hour", retour);
	}

	@Test
	public void testTimeInWordsHourAndHalf() {
		long time = System.currentTimeMillis() - (60 * 90 * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.hours#1", retour);
	}

	@Test
	public void testTimeInWordsTenHours() {
		long time = System.currentTimeMillis() - (60 * 60 * 10 * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.hours#10", retour);
	}

	@Test
	public void testTimeInWordsOneDay() {
		long time = System.currentTimeMillis() - (60 * 60 * 24 * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.day", retour);
	}
	
	@Test
	public void testTimeInWordsOneDayAndHalf() {
		long time = System.currentTimeMillis() - (60 * 60 * (24+12) * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.day", retour);
	}
	
	@Test
	public void testTimeInWordsTwoDays() {
		long time = System.currentTimeMillis() - (60 * 60 * (48) * 1000);
		String retour = WebUtils.timeInWords(time);
		assertEquals("time.days#2", retour);
	}
	@Test
	public void testTimeInWordsFewDays() {
		long time = System.currentTimeMillis() - (60 * 60 * 24 * 19 * 1000);
		String retour = WebUtils.timeInWords(time);
		System.out.println(retour);
		assertEquals("time.days#19", retour);
	}
	@Test
	public void testTimeInWordsThirtyDays() {
		long time = System.currentTimeMillis() - (60 * 60 * 24 * 30 * 1000);
		System.out.println(time);

		String retour = WebUtils.timeInWords(time);
		assertEquals("time.month", retour);
	}
	@Test
	public void testTimeInWordsSixMont() {
		long time = System.currentTimeMillis() - (60 * 60 * 24 * 30 * 1000 *6);
		System.out.println(time);
		String retour = WebUtils.timeInWords(time);
		System.out.println(retour);
		assertEquals("time.month#6", retour);
	}

}
