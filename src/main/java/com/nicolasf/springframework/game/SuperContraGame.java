package com.nicolasf.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
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
