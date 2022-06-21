package com.github.gregor499.woche6mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public interface QuestionRepository extends MongoRepository<Question, String> {

    List<Question> findAllByApproved(boolean approvalStatus);
}
