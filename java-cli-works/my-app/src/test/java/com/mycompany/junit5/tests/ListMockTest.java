package com.mycompany.junit5.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class ListMockTest {

	@Test
	@Order(3)
	void mockListSize() {
		// mock
		List<String> list = mock(List.class);
		// tell mockito what to do
		when(list.size()).thenReturn(5);
		// then assert
		assertEquals(5, list.size());
	}

	@Test
	@Order(1)
	@DisplayName(value = "This is to mock multiple entries in list with 5 and 4 ")
	void mockListSize_Multiple() {
		List<String> listMock = mock(List.class);
		when(listMock.size()).thenReturn(5).thenReturn(4);
		assertEquals(5, listMock.size());
		assertEquals(4, listMock.size());
	}

	@Test
	@Order(2)
	void mockListName() {
		List<String> listMock = mock(List.class);
//		when(listMock.get(0)).thenReturn("Aneesha");
		when(listMock.get(anyInt())).thenReturn("Aneesha");
		assertEquals("Aneesha", listMock.get(0));
		assertEquals("Aneesha", listMock.get(4));	
	}

}















