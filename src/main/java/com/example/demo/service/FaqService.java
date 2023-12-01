package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Faq;
import com.example.demo.entity.FaqTranslation;
import com.example.demo.repo.FaqRepo;

@Service
public class FaqService {
	
	@Autowired
	private FaqRepo faqRepo;
	
	public Faq save(Faq faq) {
		var translation = new FaqTranslation();
		//translation.setQuestion(faq.getQuestions());
		//translation.setAnswer(faq.getAnswers());
	
		translation.setFaq(faq);
	
		return faqRepo.save(faq);
	}
	
	
	public List<Faq> findAll() {
		return faqRepo.findAll();
	}
	
	public Faq findById(int id) {
		return faqRepo.findById(id).orElseThrow();
	}

}
