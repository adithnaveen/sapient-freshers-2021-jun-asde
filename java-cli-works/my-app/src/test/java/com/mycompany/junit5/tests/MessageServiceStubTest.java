package com.mycompany.junit5.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sapient.tdd.contracts.IMessageService;
import com.sapient.tdd.service.MessageServiceImpl;
import com.sapient.tdd.stub.MessageServiceStub;

class MessageServiceStubTest {

	@Test
	void testMessageServiceImplStubWithoutMocking() {

		IMessageService stub = new MessageServiceStub(); 
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl(stub);
		List<String> messageFromUser = messageServiceImpl.getMessageFromUser("harry");
		
		
		assertEquals(2, messageFromUser.size());
		
		
	}

}
