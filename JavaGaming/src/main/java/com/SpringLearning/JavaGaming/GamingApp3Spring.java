package com.SpringLearning.JavaGaming;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringLearning.JavaGaming.game.*;

public class GamingApp3Spring {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class);) {
            context.getBean(GameConsole.class).Attack();
        }

        // var marioGame = new MarioGame();
        // var pacManGame = new PacManGame();
        // GameRunner gameRunner = new GameRunner(pacManGame);
        // gameRunner.run();

    }

}
