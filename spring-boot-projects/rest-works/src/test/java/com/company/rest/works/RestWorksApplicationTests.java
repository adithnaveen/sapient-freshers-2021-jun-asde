package com.company.rest.works;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.company.rest.works.services.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestWorksApplicationTests {

	@Autowired
	private UserService service;

	@Test
	public void testForEmployeeLengthFromTheDatabase() {
		assertEquals(1, service.getAllUsers().size());
	}

	@Test
	public void testForUserObjectExists() {
		assertEquals("Suhas", service.getUserByIdAsObject(101).getName());
		assertNotNull(service.getUserByIdAsObject(101));
	}

	@Test
	public void testForGetUserById() {
		assertNotNull(service.getUserById(101));
	}

	@Test
	public void checkForNullForNonExistenceRecord() {
		assertNull(service.getUserByIdAsObject(1233));
	}

}
