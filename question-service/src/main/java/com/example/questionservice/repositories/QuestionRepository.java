package com.example.questionservice.repositories;

import com.example.questionservice.entities.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {

    Question findQuestionById(String id);
}
