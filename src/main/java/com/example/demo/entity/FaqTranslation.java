package com.example.demo.entity;
import com.example.demo.constance.Language;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@Table(name = "faq_translation")
@AllArgsConstructor
@NoArgsConstructor
public class FaqTranslation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@MapsId
	@ManyToOne
	@JoinColumn(name = "faq_id")
	private Faq faq;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "language")
	private Language language;
	


	
	
}
