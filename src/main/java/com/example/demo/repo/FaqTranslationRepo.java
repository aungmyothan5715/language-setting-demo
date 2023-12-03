package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.FaqTranslation;
import jakarta.persistence.Id;

public interface FaqTranslationRepo extends JpaRepository<FaqTranslation, Id> {

}
