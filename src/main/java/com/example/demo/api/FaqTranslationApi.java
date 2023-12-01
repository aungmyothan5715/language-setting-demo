//package com.example.demo.api;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.entity.FaqTranslation;
//import com.example.demo.service.FaqTranslationService;
//
//@RestController
//@RequestMapping("translations")
//public class FaqTranslationApi {
//	
//	@Autowired
//	private FaqTranslationService translationService;
//	
//	@GetMapping
//	public ResponseEntity<List<FaqTranslation>> findAll() {
//		return ResponseEntity.ok(translationService.findTranslation());
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Optional<FaqTranslation>> findOne(@PathVariable int id) {
//		return ResponseEntity.ok(translationService.findTranslationByOne(id));
//	}
//
//}
