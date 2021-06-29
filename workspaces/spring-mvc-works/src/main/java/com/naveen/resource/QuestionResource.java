package com.naveen.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.dao.QuestionDAO;
import com.naveen.entity.Question;

@RequestMapping("/api/questions")
@RestController // from spring 4
public class QuestionResource {

	@Autowired
	private QuestionDAO dao;

	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
	public List<Question> getAllQuestions() {
		return dao.getAllQuestions();
	}

	@RequestMapping(method = RequestMethod.POST, produces = { "application/json" })
	public ResponseEntity<?> saveQuestion(@RequestBody Question question) {
		System.out.println("For saving : " + question);
		return ResponseEntity.status(HttpStatus.CREATED).body(question);
	}

}
