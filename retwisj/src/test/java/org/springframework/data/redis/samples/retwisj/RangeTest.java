package org.springframework.data.redis.samples.retwisj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.data.redis.samples.retwisj.Range;

public class RangeTest {
	
	@Test
	public void rangePageNumber() {
		Range range = new Range(10);
		assertEquals(10, range.getPages());
	}
	
	@Test
	public void rangePageBeginEnd() {
		Range range = new Range(100,30);
		assertEquals(3, range.getPages());
	}
	
}
