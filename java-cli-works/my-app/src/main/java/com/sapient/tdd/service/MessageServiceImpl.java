package com.sapient.tdd.service;

import java.util.ArrayList;
import java.util.List;

import com.sapient.tdd.contracts.IMessageService;

public class MessageServiceImpl {

	private IMessageService messageService;
	
	
	public MessageServiceImpl(IMessageService messageService) {
		this.messageService = messageService; 
	}
	
	public List<String> getMessageFromUser(String user) {
		List<String> filteredMessages = new ArrayList<String>();
		
		
		List<String> messages = messageService.getMessage(user);
		
		for(String message: messages) {
			if(message.contains("harry")) {
				filteredMessages.add(message); 
			}
		}
		return filteredMessages; 
		
	}
	
	
	
}
