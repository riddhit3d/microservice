package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>{
List <Question> findByQuizId(Long quizId);
}
