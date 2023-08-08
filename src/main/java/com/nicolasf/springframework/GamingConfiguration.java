package com.nicolasf.springframework;

import com.nicolasf.springframework.game.GameRunner;
import com.nicolasf.springframework.game.GamingConsole;
import com.nicolasf.springframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
