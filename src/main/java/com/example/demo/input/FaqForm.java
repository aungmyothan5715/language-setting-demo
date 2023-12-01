package com.example.demo.input;
import java.util.Map;

import com.example.demo.constance.Language;
import com.example.demo.entity.Faq;
import com.example.demo.entity.FaqTranslation;

import lombok.Data;

@Data
public class FaqForm {
	
	private Map<Language, String> question;
	private Map<Language, String> answer;
	
	public Faq entity() {
		var entity = new Faq();
		entity.setQuestions(question);
		entity.setAnswers(answer);
		return entity;
	}

}
