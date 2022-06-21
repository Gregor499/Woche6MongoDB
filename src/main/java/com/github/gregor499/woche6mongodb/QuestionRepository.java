package com.github.gregor499.woche6mongodb;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class QuestionRepository {
	final private List<Question> questionList = new ArrayList<>();

	private Question addQuestion(Question newQuestion){
		questionList.add(newQuestion);
		return newQuestion;
	}

	private Question getQuestion(String id){
		return questionList.get(id);
	}
}
