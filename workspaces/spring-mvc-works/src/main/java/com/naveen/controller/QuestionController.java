package com.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.dao.QuestionDAO;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionDAO questionDAO; 
	

	// will be intercepted by spring and optionally if you want take model
	// model is hashmap 
	@RequestMapping(method = RequestMethod.GET, path="/all-questions")
	public  String getAllQuestion(Model model) {
		model.addAttribute("title", "Show All Questions");
		model.addAttribute("questions", questionDAO.getAllQuestions());
		
		return "show-questions";
	}
}








