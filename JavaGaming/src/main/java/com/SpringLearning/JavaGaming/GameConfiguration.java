package com.SpringLearning.JavaGaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringLearning.JavaGaming.game.GameConsole;
import com.SpringLearning.JavaGaming.game.PacManGame;

@Configuration
public class GameConfiguration {
    @Bean(name = "game") GameConsole game() {
        return new PacManGame();
    }
}
