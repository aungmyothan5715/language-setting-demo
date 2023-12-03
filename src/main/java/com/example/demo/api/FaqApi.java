package com.example.demo.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constance.Language;
import com.example.demo.entity.Faq;
import com.example.demo.input.FaqForm;
import com.example.demo.output.FaqInfo;
import com.example.demo.service.FaqService;

@RestController
@RequestMapping("faq")
public class FaqApi {
	
	@Autowired
	private FaqService faqService;
	
	@PostMapping("/create")
	public ResponseEntity<Faq> saveFaq(@RequestBody FaqForm  form) {
		return ResponseEntity.ok(faqService.save(form.entity()));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Faq> update(@RequestBody FaqForm form, @PathVariable("id") int id) {
		return ResponseEntity.ok(faqService.save(form.entity()));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<FaqInfo>> findAll(@RequestParam("language") Language language) {
		return ResponseEntity.ok(faqService.findAll(language));
	}
	
	@GetMapping()
	public ResponseEntity<List<FaqInfo>> findOne(@RequestParam int id, @RequestParam Language language) {
		return ResponseEntity.ok(faqService.findById(id, language));
	}

	@GetMapping("/language/{lang}")
	public ResponseEntity<List<Faq>> findAll(@PathVariable("lang") String lang) {
		return ResponseEntity.ok(faqService.findAllByLanguage(lang));
	}
	
}
