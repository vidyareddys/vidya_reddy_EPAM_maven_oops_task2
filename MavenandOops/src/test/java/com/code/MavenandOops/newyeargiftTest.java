package com.code.MavenandOops;

import static org.junit.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class newyeargiftTest {
	public void testApp()
    {
		giftcalculationofother gos=new giftcalculationofother();
		int other[]= {2,10,8,9,7};
		int answer=gos.totalweightofothersweets(other,other.length);
		assertEquals(317770,answer);
		
		giftcalculationofchoco gc=new giftcalculationofchoco();
		int choco[]= {1,2,3,4,5};
		int answer1=gc.totalweightofchocolates(choco,choco.length);
		assertEquals(529,answer1);
		
		assertTrue(true);
    }
}
