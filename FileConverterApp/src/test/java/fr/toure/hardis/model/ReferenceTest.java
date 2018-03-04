package fr.toure.hardis.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReferenceTest {
	Reference reference = new Reference();
	
	@Before
	public void init(){
		reference.setNumReference("0123456789");
		reference.setPrice(10.89);
		reference.setSize(15);
		reference.setType("R");
	}
	
	@Test
	public void getAndSetNumReferenceTest(){
		assertEquals("0123456789", reference.getNumReference());
		reference.setNumReference("9876543210");
		assertEquals("9876543210", reference.getNumReference());
	}
	
	@Test
	public void getAndSetPriceTest(){
		assertEquals(10.89, reference.getPrice(), 0);
		reference.setPrice(89.10);
		assertEquals(89.10, reference.getPrice(), 0);
	}
	
	@Test
	public void getAndSetSizeTest(){
		assertEquals(15, reference.getSize());
		reference.setSize(51);
		assertEquals(51, reference.getSize());
	}
	
	@Test
	public void getAndSetTypeTest(){
		assertEquals("R", reference.getType());
		reference.setType("G");
		assertEquals("G", reference.getType());
	}
}
