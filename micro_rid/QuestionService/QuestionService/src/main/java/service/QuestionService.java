package service;

import java.util.List;

import entity.Question;

public interface QuestionService {
	Question create(Question question);
	List<Question> get();
	Question getOne(Long id);
	List<Question> getQuestionsOfuiz(Long  quizId);

}
