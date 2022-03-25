package com.example.questionservice.services;

import com.example.questionservice.entities.Question;
import com.example.questionservice.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question findQuestion(String id) {
        return questionRepository.findQuestionById(id);
    }
}
