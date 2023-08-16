package com.nicolasf.springframework.game;

import com.nicolasf.springframework.game.GameRunner;
import com.nicolasf.springframework.game.PacmanGame;

public class App01GamingBasic {

    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
