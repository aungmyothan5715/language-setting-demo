package com.example.demo.entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.constance.Language;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FAQ")
@Entity
public class Faq {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "language")
	private Language languageId;

	@ElementCollection
	//@CollectionTable(name = "faq_translation", joinColumns = @JoinColumn(name = "faq_id"))
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name = "questions", nullable = false)
	private Map<Language, String> questions = new HashMap<>();
	
	@ElementCollection
	//@CollectionTable(name = "faq_translation", joinColumns = @JoinColumn(name = "faq_id"))
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name = "answers",nullable = false)
	private Map<Language, String> answers = new HashMap<>();
	
	@OneToMany(mappedBy = "faq", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FaqTranslation> translations = new ArrayList<FaqTranslation>();
	
	


}
