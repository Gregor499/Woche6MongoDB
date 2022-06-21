package com.github.gregor499.woche6mongodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Question {
	private final String id = UUID.randomUUID().toString();
	private String question;
}
