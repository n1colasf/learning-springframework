package com.nicolasf.springframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nicolasf.springframework.game")
public class App03GamingSpring {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(App03GamingSpring.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GamingConsole.class).down();

            context.getBean(GameRunner.class).run();
        }
    }
}
