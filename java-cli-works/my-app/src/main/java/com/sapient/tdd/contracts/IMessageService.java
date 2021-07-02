package com.sapient.tdd.contracts;

import java.util.List;

public interface IMessageService {
	 List<String> getMessage(String user);
	 
	 void deleteMessageFromUser(String user); 
}
