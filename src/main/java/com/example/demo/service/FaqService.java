package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constance.Language;
import com.example.demo.entity.Faq;
import com.example.demo.output.FaqInfo;
import com.example.demo.repo.FaqRepo;

@Service
public class FaqService {
	
	@Autowired
	private FaqRepo faqRepo;
	
	public Faq save (Faq faq) {
		return faqRepo.save(faq);
	}
	
	public List<Faq> findAll() {
		return faqRepo.findAll();
	}
	
	public FaqInfo findById(int id, Language language) {
		var faq = faqRepo.findById(id).orElseThrow();
		var response = new FaqInfo();
		response.setAnswer(faq.getAnswers().get(language));
		response.setQuestion(faq.getQuestions().get(language));
		return response;
	}

	
//	public List<Faq> findAllByLanguage(String lang){
//		return faqRepo.findAllByLanguage(lang);
//	}
}
