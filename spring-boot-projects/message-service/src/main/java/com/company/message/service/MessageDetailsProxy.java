package com.company.message.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MESSAGE-DETAILS-SERVICE", url = "localhost:9060")
public interface MessageDetailsProxy {

	@GetMapping("/message-details")
	public String getMessageDetails();
}
