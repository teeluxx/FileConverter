package fr.toure.hardis.util;

import org.junit.Assert;
import org.junit.Test;

import fr.toure.hardis.utils.Util;

public class UtilTest {
	@Test
	public void checkNumReferenceTest(){
		Assert.assertTrue(Util.checkNumReference("0123456789"));
		Assert.assertFalse(Util.checkNumReference("012345678"));
		Assert.assertFalse(Util.checkNumReference("012345678Y"));
	}
	
	@Test
	public void checkColorTest(){
		Assert.assertFalse(Util.checkColor("E"));
		Assert.assertFalse(Util.checkColor("Z"));
		Assert.assertTrue(Util.checkColor("G"));
		Assert.assertTrue(Util.checkColor("R"));
	}
}
