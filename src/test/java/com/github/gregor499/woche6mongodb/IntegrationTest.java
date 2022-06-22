package com.github.gregor499.woche6mongodb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class IntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void integrationTest() {
        ResponseEntity<Question[]> getResponseEntity = restTemplate.getForEntity("/api/questions", Question[].class);
        assertThat(getResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(getResponseEntity.getBody()).isEmpty();

        ResponseEntity<Question> createResponseEntity = restTemplate.postForEntity("/api/questions", new Question("1", "testfrage", "testanwort", true), Question.class);
        assertThat(createResponseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(createResponseEntity.getBody().getId()).isEqualTo("1");
    }
}
