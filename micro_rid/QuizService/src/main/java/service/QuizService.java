package service;

import java.util.List;

import com.cybage.QuizService.entity.Quiz;

public interface QuizService {
Quiz add(Quiz quiz);
List<Quiz> get();
Quiz getOne(Long id);
}
