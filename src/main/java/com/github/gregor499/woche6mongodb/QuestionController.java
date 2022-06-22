package com.github.gregor499.woche6mongodb;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/questions")
@RequiredArgsConstructor

public class QuestionController {

    private final QuestionService questionService;

    @GetMapping
    public List<Question> getQuestions() {
        return questionService.getApprovedQuestions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestion(@PathVariable String id) {
        return ResponseEntity.of(questionService.getQuestion(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }
}

