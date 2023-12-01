//package com.example.demo.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.Faq;
//import com.example.demo.entity.FaqTranslation;
//import com.example.demo.repo.FaqTranslationRepo;
//
//@Service
//public class FaqTranslationService {
//	
//	@Autowired
//	private FaqTranslationRepo faqTranslationRepo;
//	
//	public List<FaqTranslation> findTranslation() {
//		return faqTranslationRepo.findAll();
//	}
//	
//	public Optional<FaqTranslation> findTranslationByOne(int id) {
//		return faqTranslationRepo.findById(id);
//	}
//
//}
