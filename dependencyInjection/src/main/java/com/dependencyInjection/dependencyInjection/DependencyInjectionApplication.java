package com.dependencyInjection.dependencyInjection;

import com.dependencyInjection.dependencyInjection.magicBalls.MagicBallService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {

	public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MagicBallService magic8Ball = context.getBean("magicEightBall", MagicBallService.class);
        System.out.println("_________________________\n");
        System.out.println("  Constructor injection: ");
        System.out.println("_________________________\n");
        System.out.println(magic8Ball.getName());
        System.out.println(magic8Ball.shake());

        MagicBallService magic9Ball = context.getBean("magicNineBall", MagicBallService.class);
        System.out.println("\n_________________________\n");
        System.out.println("    Setter injection:      ");
        System.out.println("_________________________\n");
        System.out.println(magic9Ball.getName());
        System.out.println(magic9Ball.shake());
        System.out.flush();

        AllMagicBalls allMagicBalls = context.getBean("allMagicBalls", AllMagicBalls.class);
        System.out.println("\n_________________________\n");
        System.out.println("    List  injection:       ");
        System.out.println("_________________________\n");
        allMagicBalls.show();
        System.out.println("_________________________\n");

        System.out.flush();
        context.close();

	}

}

