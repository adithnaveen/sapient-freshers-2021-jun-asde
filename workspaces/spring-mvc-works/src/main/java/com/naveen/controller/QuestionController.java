package com.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.dao.QuestionDAO;
import com.naveen.entity.Question;

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
	
	@RequestMapping(method =  RequestMethod.GET, path="/add-question")
	public String addQuestion(Model model) {
		
		model.addAttribute("question", new Question()); 
		return "question-form";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, path="/save-question")
	public String saveQuestion(@ModelAttribute ("question") Question question) {
		
		return questionDAO.saveQuestion(question) ? "hello" :"error";

	}
	
	 
}








