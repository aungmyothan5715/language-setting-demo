package com.example.demo.output;
import java.util.Map;

import com.example.demo.constance.Language;
import com.example.demo.entity.Faq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqInfo {
	
	private String question;
	private String answer;
	

//	public Faq entity() {
//		var entity = new Faq();
//		question.keySet();
//		question.values();
//		answer.keySet();
//		answer.values();
//		return entity;
//	}
//	
}
