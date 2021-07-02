package com.mycompany.junit5.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sapient.tdd.contracts.IMessageService;
import com.sapient.tdd.service.MessageServiceImpl;

class MessageServiceImplMockTest {

	@Test
	@DisplayName("testMessageServiceImplStubUsingMock")
	void testMessageServiceImplStubUsingMock() {
		IMessageService messageServiceMock 
			= mock(IMessageService.class); 
		
		List<String> list = Arrays.asList("harry how are you ",
				 "i know harry you inside", "peter come outside");

		when(messageServiceMock.getMessage("harry")).thenReturn(list); 
		
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl(messageServiceMock); 
		List<String> messageFromUser = messageServiceImpl.getMessageFromUser("harry");
		assertEquals(2, messageFromUser.size());
		
	}

}





