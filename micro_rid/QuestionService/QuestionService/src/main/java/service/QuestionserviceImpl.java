package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Question;
import repo.QuestionRepo;
@Service
public class QuestionserviceImpl implements QuestionService {
//	@Autowired
private QuestionRepo questionRepo;

	public QuestionserviceImpl(QuestionRepo questionRepo) {
		this.questionRepo=questionRepo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepo.save(question) ;
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRepo.findAll();
	}

	@Override
	public Question getOne(Long id) {
		// TODO Auto-generated method stub
		return questionRepo.findById(id).orElseThrow(() -> new RuntimeException("question  id not found"));
	}

	@Override
	public List<Question> getQuestionsOfuiz(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepo.findByQuizId(quizId);
	}

}
