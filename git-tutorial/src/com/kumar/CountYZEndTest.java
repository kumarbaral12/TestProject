package com.kumar;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CountYZEndTest {

	@Test
	void test() {

		int count1 = CountYZEnd.countYZ("fez day");
		int count2 = CountYZEnd.countYZ("ppwy  @ktlz");
		int count3 = CountYZEnd.countYZ("day fez");
		int count4 = CountYZEnd.countYZ("day fyyyz");
		int count5 = CountYZEnd.countYZ("day yak");
		int count6 = CountYZEnd.countYZ("day:yak");
		int count7 = CountYZEnd.countYZ("!!day--yaz!!");
		int count8 = CountYZEnd.countYZ("yak zak");
		int count9 = CountYZEnd.countYZ("aaz yyz my");
		int count10 = CountYZEnd.countYZ("y2bz");
		int count11 = CountYZEnd.countYZ("zxyx");
		
		assertEquals(2, count1);
		assertEquals(2, count2);
		assertEquals(2, count3);
		assertEquals(2, count4);
		assertEquals(1, count5);
		assertEquals(1, count6);
		assertEquals(2, count7);
		assertEquals(0, count8);
		assertEquals(3, count9);
		assertEquals(2, count10);
		assertEquals(0, count11);		

	}

}
