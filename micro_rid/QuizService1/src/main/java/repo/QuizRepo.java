package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz,Long> {
}



