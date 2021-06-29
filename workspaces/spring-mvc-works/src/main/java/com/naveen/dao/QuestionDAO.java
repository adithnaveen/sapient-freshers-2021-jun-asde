package com.naveen.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.naveen.entity.Question;

@Component
public class QuestionDAO {

	public List<Question> getAllQuestions() {
		return Arrays.asList(
			
				new Question("james gosling invention", "Java", "C Progrmming", "C++", "Pascal"), 
				new Question("indian president", "APJ Abdul Kalam", "Shankar Dayal Sharma", "Venkataraman", "Ramnath Kovind"), 
				new Question("Where is india", "Asia", "Africa", "Ameria", "Mars"), 
				new Question("work from home ", "is good", "not good", "i'm okay", "2 days from home is good")
			); 
	}
	
	public boolean saveQuestion(Question question) {
		System.out.println("Question " + question.getQuestion());
		System.out.println("Option1 " + question.getOption1());
		System.out.println("Option2 " + question.getOption2());
		System.out.println("Option3 " + question.getOption3());
		System.out.println("Option4 " + question.getOption4());
		
		
		return true; 
	}
}
