package com.example.demo.output;

import com.example.demo.entity.Faq;
import com.example.demo.entity.FaqTranslation;

import lombok.Data;

@Data
public class FaqInfo {
	
	private int question;
	private String answer;
	
	public FaqInfo(FaqTranslation entity) {
		this.question = entity.getId();
	}
	

}
