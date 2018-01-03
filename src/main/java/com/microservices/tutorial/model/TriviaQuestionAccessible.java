package com.microservices.tutorial.model;

import java.util.List;

import com.microservices.tutorial.vo.TriviaQuestion;

public interface TriviaQuestionAccessible {

	TriviaQuestion getQuestionByIndex(long index);

	TriviaQuestion getQuestionById(long id);

	TriviaQuestion getRandomQuestion();

	List<TriviaQuestion> getQuestionList(long offset);

	List<TriviaQuestion> getSpecifiedQuestionList(long... id);

	long getQuestionListSize();
}