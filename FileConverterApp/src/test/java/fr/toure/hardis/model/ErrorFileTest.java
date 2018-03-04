package fr.toure.hardis.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ErrorFileTest {
	ErrorFile errorFile = new ErrorFile();
	
	@Before
	public void init(){
		errorFile.setLine(3);
		errorFile.setMessage("Incorrect value");
		errorFile.setValue("1462100403;A;100.1;9");
	}
	
	@Test
	public void getAndSetLineTest(){
		assertEquals(3, errorFile.getLine());
		errorFile.setLine(5);
		assertEquals(5, errorFile.getLine());
	}
	
	@Test
	public void getAndSetMessageTest(){
		assertEquals("Incorrect value", errorFile.getMessage());
		errorFile.setMessage("Incorrect value again");
		assertEquals("Incorrect value again", errorFile.getMessage());
	}
	
	@Test
	public void getAndSetValueTest(){
		assertEquals("1462100403;A;100.1;9", errorFile.getValue());
		errorFile.setValue("1462100403;A;100.1;6");
		assertEquals("1462100403;A;100.1;6", errorFile.getValue());
	}
}
