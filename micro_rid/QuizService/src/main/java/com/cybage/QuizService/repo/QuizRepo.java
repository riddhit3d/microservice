package com.cybage.QuizService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.QuizService.entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Long> {

}
