package com.github.gregor499.woche6mongodb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class IntegrationTest {

    @Autowired
    TestRestTemplate testRestTemplate;
/*
    @Test
 *//*   void integrationTest(){
        ResponseEntity<Question[]> response = testRestTemplate.getForEntity("/api/questions", Question[].class);

        Assertions.assertThat(response.getBody()).hasSize(0);

        Question testQuestion = new Question(null, "sas?", "seeees", true)

        ResponseEntity<Question> response2 = testRestTemplate.postForEntity("/api/questions", testQuestion, Question.class);

        Assertions.assertThat(response2.getBody().getId()).isNotBlank();

        String testId
    }*/
}
