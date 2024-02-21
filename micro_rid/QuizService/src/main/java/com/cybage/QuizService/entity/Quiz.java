package com.cybage.QuizService.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
 transient private List<Question> questions;
public List<Question> getQuestions() {
	return questions;
}
public void setQuestions(List<Question> questions) {
	this.questions = questions;
}
public Quiz(Long id, String title) {
	super();
	this.id = id;
	this.title = title;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
}