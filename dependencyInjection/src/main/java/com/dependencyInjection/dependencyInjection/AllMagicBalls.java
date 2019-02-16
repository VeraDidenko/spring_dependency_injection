package com.dependencyInjection.dependencyInjection;

import com.dependencyInjection.dependencyInjection.magicBalls.MagicBallService;

import java.util.Collection;

public class AllMagicBalls {

    Collection<MagicBallService> magicBallList;

    public void setMagicBallList(Collection<MagicBallService> magicBallList) {
        this.magicBallList = magicBallList;
    }

    public void show() {
        for (MagicBallService magicBall : magicBallList) {
            System.out.println(magicBall.getName() + " " + magicBall.shake());
        }
    }

}
