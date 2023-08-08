package com.nicolasf.springframework.game;

public class SuperContraGame implements GamingConsole {
        public void up() {
            System.out.println("Run");
        }
        public void down() {
            System.out.println("To the floor");
        }
        public void left() {
            System.out.println("Take cover");
        }
        public void right() {
            System.out.println("Shoot");
        }
}
