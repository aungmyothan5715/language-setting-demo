package com.example.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Faq;

public interface FaqRepo extends JpaRepository<Faq, Integer>{
	
	//@Query(value = "select * from faq_questions a where a.language_id = :lang")
	//List<Faq> findAllByLanguage(@PathVariable("lang") String lang);

}