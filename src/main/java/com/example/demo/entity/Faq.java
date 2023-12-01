package com.example.demo.entity;
import java.util.HashMap;
import java.util.Map;
import com.example.demo.constance.Language;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKeyColumn;
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

	@ElementCollection
	//@CollectionTable(name = "faq_translation", joinColumns = @JoinColumn(name = "faq_id"))
	@MapKeyColumn(name = "language_id")
	@Column(name = "questions", nullable = false, unique = true)
	private Map<Language, String> questions = new HashMap<>();
	
	@ElementCollection
	//@CollectionTable(name = "faq_translation", joinColumns = @JoinColumn(name = "faq_id"))
	@MapKeyColumn(name = "language_id")
	@Column(name = "answers",nullable = false, unique = true)
	private Map<Language, String> answers = new HashMap<>();

	
	
//    @OneToMany(mappedBy = "faq", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<FaqTranslation> translations = new ArrayList<FaqTranslation>();
//	
//	
	
	

}
