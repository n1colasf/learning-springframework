package com.nicolasf.springframework;

import com.nicolasf.springframework.game.GameRunner;
import com.nicolasf.springframework.game.GamingConsole;
import com.nicolasf.springframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GamingConsole.class).down();

            context.getBean(GameRunner.class).run();
        }
    }
}
