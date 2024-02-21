package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cybage.QuizService.entity.Quiz;
import com.cybage.QuizService.repo.QuizRepo;
@Service
public class QuizServiceImpl implements QuizService  {

	private QuizRepo quizRepo;
	
	public QuestionClient questionClient;
	public QuizServiceImpl(QuizRepo quizRepo,QuestionClient question)
	{this.quizRepo=quizRepo;
	this.questionClient  = questionClient;
	}
	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz>  get() {
		// TODO Auto-generated method stub
		List<Quiz> quizzes = 	quizRepo.findAll();
		List<Quiz>newQuizList =quizzes.stream().map(quiz ->{
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		return newQuizList;
	}

	@Override
	public Quiz getOne(Long id) {
		// TODO Auto-generated method stub
		Quiz quiz= quizRepo.findById(id).orElseThrow(()-> new RuntimeException("quiz not found "));
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
	}


}
