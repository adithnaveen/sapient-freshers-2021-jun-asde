package com.sapient.tdd.stub;

import java.util.Arrays;
import java.util.List;

import com.sapient.tdd.contracts.IMessageService;

public class MessageServiceStub  implements IMessageService{
	// these values are got from external resource 
	@Override
	public List<String> getMessage(String user) {
		 return 
				 Arrays.asList("harry how are you ",
						 "i know harry you inside", "peter come outside");
		 
		 
	}
	
	@Override
	public void deleteMessageFromUser(String user) {
		
	}
}
