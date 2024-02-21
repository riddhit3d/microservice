package entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
transient private List<Question> questions;
public Quiz(Long id, String title, List<Question> questions) {
	super();
	this.id = id;
	this.title = title;
	this.questions = questions;
}
public List<Question> getQuestions() {
	return questions;
}
public Quiz() {
	super();
	// TODO Auto-generated constructor stub
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
public void setQuestions(List<Question> questionOfQuiz) {
	// TODO Auto-generated method stub
	
}
}