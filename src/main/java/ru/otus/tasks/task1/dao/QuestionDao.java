package ru.otus.tasks.task1.dao;

import ru.otus.tasks.task1.domain.Question;

import java.io.IOException;
import java.util.List;

public interface QuestionDao {
    List<Question> getNewQuestions() throws IOException;
 }
