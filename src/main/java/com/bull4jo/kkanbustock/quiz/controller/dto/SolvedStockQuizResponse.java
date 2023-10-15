package com.bull4jo.kkanbustock.quiz.controller.dto;

import com.bull4jo.kkanbustock.quiz.domain.entity.SolvedStockQuiz;
import com.bull4jo.kkanbustock.quiz.domain.entity.StockQuiz;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
public class SolvedStockQuizResponse {
    private final List<SolvedStockQuiz> solvedStockQuizzes;

    @Builder
    public SolvedStockQuizResponse(List<SolvedStockQuiz> solvedStockQuizzes) {
        this.solvedStockQuizzes = solvedStockQuizzes;
    }

}
