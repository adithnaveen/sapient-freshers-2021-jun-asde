package com.mycompany.junit5.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MockitoSpy {

	@Test
	void spyForArrayList() {
		List<String> list = spy(ArrayList.class); 
		
		assertEquals(0, list.size());
		
		list.add("Harashit");
		assertEquals(1, list.size());
		 
	}
	
	// this test case will fail as you are mocking 
	// but in reality the objects doesnot exist 
	@Test
	void mockElement() {
		List<String> list = mock(ArrayList.class);
		assertEquals(0, list.size());
		list.add("Harashit");
		assertEquals(1, list.size());
		
	}
	

}
