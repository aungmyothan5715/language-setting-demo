package com.example.demo.output;

import com.example.demo.constance.Language;
import com.example.demo.entity.Faq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqInfo {
	private int id;
	private Language lang;
	
	private String questionForEnglish;
	private String questionForMyanmar;
	private String questionForThai;
	private String questionForChinese;
	
	private String answerForEnglish;
	private String answerForMyanmar;
	private String answerForThai;
	private String answerForChinese;
	

//	public static FaqInfo from(Faq entity) {
//	var translation = new FaqTranslation();
//	translation<FaqTranslation, Faq>().
//		return null;
//	}

	public static FaqInfo form(Faq entity, Language language) {
		FaqInfo faqInfos = new FaqInfo();
		faqInfos.setId(entity.getId());
		faqInfos.setLang(entity.getLanguageId());
		
		//faqInfos.setQuestion(String.join(", ", entity.getQuestions().values()));
		//faqInfos.setAnswer(String.join(", ", entity.getAnswers().values()));
		
		switch (language) {
		case English: faqInfos.setQuestionForEnglish(entity.getQuestions().get(Language.English));
		faqInfos.setAnswerForEnglish(entity.getAnswers().get(Language.English));
		break;
		
		case Myanmar: faqInfos.setQuestionForMyanmar(entity.getAnswers().get(Language.Myanmar));
		faqInfos.setAnswerForMyanmar(entity.getAnswers().get(Language.Myanmar));
		break;
		
		case Thai: faqInfos.setQuestionForThai(entity.getQuestions().get(Language.Thai));
		faqInfos.setAnswerForThai(entity.getAnswers().get(Language.Thai));
		break;
		
		case Chinese: faqInfos.setQuestionForChinese(entity.getAnswers().get(Language.Chinese));
		faqInfos.setAnswerForChinese(entity.getAnswers().get(Language.Chinese));
		break;
		
		
		}
		return faqInfos;
	}
	
	public static FaqInfo form1(Faq entity, Language language) {
		FaqInfo faqInfo = new FaqInfo();
		faqInfo.setId(entity.getId());
		faqInfo.setLang(language);
		//faqInfo.setQuestion(entity.getQuestions().get(language));
		//faqInfo.setAnswer(entity.getAnswers().get(language));
		
		switch (language) {
		case English: faqInfo.setQuestionForEnglish(entity.getQuestions().get(Language.English));
		faqInfo.setAnswerForEnglish(entity.getAnswers().get(Language.English));
		break;
		
		case Myanmar: faqInfo.setQuestionForMyanmar(entity.getAnswers().get(Language.Myanmar));
		faqInfo.setAnswerForMyanmar(entity.getAnswers().get(Language.Myanmar));
		break;
		
		case Thai: faqInfo.setQuestionForThai(entity.getQuestions().get(Language.Thai));
		faqInfo.setAnswerForThai(entity.getAnswers().get(Language.Thai));
		break;
		
		case Chinese: faqInfo.setQuestionForChinese(entity.getAnswers().get(Language.Chinese));
		faqInfo.setAnswerForChinese(entity.getAnswers().get(Language.Chinese));
		break;
		
		}
		return faqInfo;
	}

}
