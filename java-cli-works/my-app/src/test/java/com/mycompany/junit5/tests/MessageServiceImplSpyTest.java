package com.mycompany.junit5.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sapient.tdd.contracts.IMessageService;
import com.sapient.tdd.service.MessageServiceImpl;

class MessageServiceImplSpyTest {

	@Test
	@DisplayName("message Service Spy Test")
	void messageServiceSpyTest() {
		
		IMessageService messageServiceSpy
			= spy(IMessageService.class); 
		
		ArrayList messages = spy(ArrayList.class);
		
		messages.add("harry how are you");
		messages.add("i know harry you inside"); 
		messages.add("peter come outside"); 
		
		
		when(messageServiceSpy.getMessage("harry")).
			thenReturn(messages); 
		
		 MessageServiceImpl messageServiceImpl = new MessageServiceImpl(messageServiceSpy);
		 List<String> messageFromUser = messageServiceImpl.getMessageFromUser("harry"); 
		
		 assertEquals(2, messageFromUser.size());
	}

}






