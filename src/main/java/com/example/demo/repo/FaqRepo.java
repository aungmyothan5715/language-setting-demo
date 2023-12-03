package com.example.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.constance.Language;
import com.example.demo.entity.Faq;

public interface FaqRepo extends JpaRepository<Faq, Integer>{
	
	List<Faq> findAllByLanguageId(@PathVariable("lang") Language lang);

}