package com.app.questionnaire.model.service;

import com.app.questionnaire.model.entity.Answer;
import com.app.questionnaire.model.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * конкретный сервис для управления операциями
 * с ответами пользователей на поля форм
 *
 * @author Катя Левкович
 * @version 1.1, 29.06.2023
 */
@Service
@RequiredArgsConstructor
public class AnswerService implements IAnswerService {
    private final AnswerRepository answerRepository;

    @Override
    public Answer getAnswerById(Long id) {
        return answerRepository.getAnswerById(id);
    }

    @Override
    public List<Answer> getAnswersByAnsweredFormId(Long id) {
        return answerRepository.getAnswersByAnsweredFormId(id);
    }

    @Override
    public List<Answer> getAnswersByFieldId(Long id) {
        return answerRepository.getAnswersByFieldId(id);
    }

    @Override
    public void deleteAnswerById(Long id) {
        answerRepository.deleteById(id);
    }

    @Override
    public Answer saveAnswer(Answer answer) {
        return answerRepository.save(answer);
    }
}
