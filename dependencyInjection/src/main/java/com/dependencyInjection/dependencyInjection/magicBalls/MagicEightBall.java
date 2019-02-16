package com.dependencyInjection.dependencyInjection.magicBalls;

import com.dependencyInjection.dependencyInjection.answers.AnswerService;

public class MagicEightBall implements MagicBallService{

    private AnswerService answerService;

    public MagicEightBall(AnswerService answerService) {
        this.answerService = answerService;
    }

    @Override
    public String getName() {
        return "*** Magic 8 Ball ***";
    }

    @Override
    public String shake() {
        return answerService.giveAnswer();
    }
}
