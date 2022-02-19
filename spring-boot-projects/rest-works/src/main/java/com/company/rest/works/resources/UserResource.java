package com.company.rest.works.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.company.rest.works.exception.UserNotFoundException;
import com.company.rest.works.model.User;
import com.company.rest.works.services.UserService;

@RestController
public class UserResource {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String hello() {
		return "Working....";
	}

	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}

	@PostMapping(value = "/users")
	public ResponseEntity<Object> saveUser( @RequestBody User user) {

		User savedUser = userService.saveUser(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

	@GetMapping(value = "/users/{id}")
	public User getUser(@PathVariable("id") Integer id) {

		Optional<User> user = userService.getUserById(id);

		if (user.isPresent()) {
			return user.get();
		}
		return new User();
	}

	@GetMapping(value = "/users/obj/{id}")
	public User getUserAsObject(@PathVariable("id") Integer id) throws UserNotFoundException {
		var user = userService.getUserByIdAsObject(id);

		if (user == null) {
			throw new UserNotFoundException("user Not Found with id:  " + id);
		}

		return null;
	}
}
