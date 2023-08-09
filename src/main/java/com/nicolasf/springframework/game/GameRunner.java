package com.nicolasf.springframework.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game is: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
