package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constance.Language;
import com.example.demo.entity.Faq;
import com.example.demo.entity.FaqTranslation;
import com.example.demo.output.FaqInfo;
import com.example.demo.repo.FaqRepo;
import com.example.demo.repo.FaqTranslationRepo;

@Service
public class FaqService {
	
	@Autowired
	private FaqRepo faqRepo;
	@Autowired
	private FaqTranslationRepo translationRepo;
	
	public Faq save (Faq faq) {
		Faq faq1 = faqRepo.save(faq);
		
		var translation = new FaqTranslation();
		translation.setFaq(faq);
		translation.setLanguage(faq.getLanguageId());
		translationRepo.save(translation);
		
		return faq1;
	}
	
	public Faq update(Faq faq, int id) {
		var fa = faqRepo.findById(id).orElseThrow();
		fa.setId(id);
		fa.setQuestions(faq.getQuestions());
		faq.setAnswers(faq.getAnswers());
		return fa;
	}
	
	public List<FaqInfo> findAll(Language language) {
		List<FaqInfo> faqs = faqRepo.findAll().stream().map(fa -> FaqInfo.form(fa, language)).collect(Collectors.toList());
//		List<FaqInfo> faqInfo = faqs.stream().map(faq -> {
//			FaqInfo faqInfos = new FaqInfo();
//			faqInfos.setId(faq.getId());
//			faqInfos.setLang(faq.getLanguageId());
//			faqInfos.setQuestion(String.join(", ", faq.getQuestions().values()));
//			faqInfos.setAnswer(String.join(", ", faq.getAnswers().values()));
//			return faqInfos;
//		}).collect(Collectors.toList());
//		
		return faqs;

	}
	
	public List<FaqInfo> findById(int id, Language language) {
		Optional<Faq> faq = faqRepo.findById(id);
		
		List<FaqInfo> faqInfo = faq.stream().map(fa -> FaqInfo.form1(fa, language)).collect(Collectors.toList());
		return faqInfo;
//		return faq.map(fa -> {
//			FaqInfo faqInfo = new FaqInfo();
//			faqInfo.setId(fa.getId());
//			faqInfo.setLang(language);
//			faqInfo.setQuestion(fa.getQuestions().get(language));
//			faqInfo.setAnswer(fa.getAnswers().get(language));
//			return faqInfo;
//		});
//		

	
//		var response = new FaqInfo();
//		response.setId(faq.getId());
//		response.setLang(language);
//		response.setAnswer(faq.getAnswers().get(language));
//		response.setQuestion(faq.getQuestions().get(language));
	
	}

	public List<Faq> findAllByLanguage(String lang) {
		Language.valueOf(lang);
		return null; //translationRepo.findById(lang).count();
	}

	
	
//	public List<Faq> findAllByLanguage(String lang){
//		return faqRepo.findAllByLanguage(lang);
//	}
}
