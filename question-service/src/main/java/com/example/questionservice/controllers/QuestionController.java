package com.example.questionservice.controllers;

import com.example.questionservice.entities.Question;
import com.example.questionservice.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/")
    public Question saveQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }

    @GetMapping("/{id}")
    public Question findQuestion(@PathVariable("id") String id){
        return questionService.findQuestion(id);
    }
}
