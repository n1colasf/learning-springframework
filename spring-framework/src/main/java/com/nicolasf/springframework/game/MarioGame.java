package com.nicolasf.springframework.game;
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jumping up");
    }
    public void down() {
        System.out.println("Going down");
    }
    public void left() {
        System.out.println("Going left");
    }
    public void right() {
        System.out.println("Going right");
    }

}
