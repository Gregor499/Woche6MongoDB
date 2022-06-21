package com.github.gregor499.woche6mongodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Document(collection = "questions")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Question {

	@Id
	private String id;
	private String question;
	private String correctAnswer;
	private boolean approved;
}
