package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Question;
import service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	private QuestionService questionService;
	
	public QuestionController(QuestionService questionService) {
		this.questionService=questionService;
	}
	@PostMapping()
public Question create(@RequestBody Question question) {
	return questionService.create(question);
	
}
	@GetMapping()
public List<Question>getAll(){
	return questionService.get();
	
}
	@GetMapping()
public Question getOne(@PathVariable Long questionId) {
	return questionService.getOne(questionId);
}
	public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfuiz(quizId);
		
	}
	
}
