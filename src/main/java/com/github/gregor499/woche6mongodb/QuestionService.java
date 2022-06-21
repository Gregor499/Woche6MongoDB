package com.github.gregor499.woche6mongodb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getApprovedQuestions() {
        return questionRepository.findAllByApproved(true);
    }

    public List<Question> getOpenQuestions() {
        return questionRepository.findAllByApproved(false);
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Optional<Question> getQuestion(String id) {
        return questionRepository.findById(id);
    }
}
