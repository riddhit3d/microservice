package service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cybage.QuizService.entity.Question;

@FeignClient(url="http://localhost:8532,value="Question-Client")
		
public interface QuestionClient {
	@GetMapping("/question/quiz/quizId")
	List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
