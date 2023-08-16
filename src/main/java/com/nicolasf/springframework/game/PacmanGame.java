package com.nicolasf.springframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Eating up");
    }
    public void down() {
        System.out.println("Eating down");
    }
    public void left() {
        System.out.println("Eating left");
    }
    public void right() {
        System.out.println("Eating right");
    }
}
