package com.dependencyInjection.dependencyInjection.magicBalls;

import com.dependencyInjection.dependencyInjection.answers.AnswerService;

public class MagicNineBall implements MagicBallService{

    private AnswerService answerService;

    public void setAnswerService(AnswerService answerService) {
        this.answerService = answerService;
    }

    @Override
    public String getName() {
        return "*** Magic 9 Ball ***";
    }

    @Override
    public String shake() {
        return answerService.giveAnswer();
    }
}
