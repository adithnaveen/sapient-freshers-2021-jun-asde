package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.sapient.tdd.Sample;


// SampleTest s = new SampleTest() - junit 
public class SampleTest {
	
	Sample sample;
	
	@Before
	public void setUp() {
		System.out.println("Before each test case ");
		sample = new Sample();		
	}
	
	@After
	public void tearDown() {
		System.out.println("After each test case ");
	}
	
	@BeforeClass
	public static void setUpBeforeClass() {
			System.out.println("i'm before class");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("i'm after class ");
	}
	

	@Test
	public void sayHiTest() {
		String name = "naveen"; 
		assertEquals("to say hi to the name sent ", "Hi "+ name, sample.sayHi(name));
	}

	@Test(timeout = 5000)
//	@Ignore
	public void storeEmployeeTestValidCase() {
		String name = "naveen"; 
		int empId = 101; 
		assertEquals("to validate the name is " + name ,"Stored " + name, sample.storeEmployee(name, empId));
	}
	
	@Test(expected = RuntimeException.class)
	public void storeEmployeeTestExceptionCase() {
		String name = "Akhil"; 
		int empId = 101; 
		assertEquals("Stored " + name, sample.storeEmployee(name, empId));
	}
	
	@Test
	public void checkWithNullValue() {
		String name = "Sid"; 
		assertNull(sample.sayHi(name));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
