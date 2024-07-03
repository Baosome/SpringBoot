package com.SpringLearning.JavaGaming2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.SpringLearning.JavaGaming2.game.*;

@Configuration
@ComponentScan("com.SpringLearning.JavaGaming2.game")
public class GamingApp4SpringLauncher {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (GamingApp4SpringLauncher.class);) {
            
            context.getBean(GameConsole.class).Attack();
            context.getBean(GameRunner.class).run();
        }

        // var marioGame = new MarioGame();
        // var pacManGame = new PacManGame();
        // GameRunner gameRunner = new GameRunner(pacManGame);
        // gameRunner.run();

    }

}
