package com.SpringLearning.JavaGaming2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringLearning.JavaGaming2.game.*;

@Configuration
public class GameConfiguration {
    @Bean GameConsole game() {
        return new PacManGame();
    }

    @Bean GameRunner runner(GameConsole game) {
        return new GameRunner(game);
    }
}
