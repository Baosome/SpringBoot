package com.SpringLearning.JavaGaming2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private GameConsole game;

    public GameRunner(@Qualifier("PacmanQualifier") GameConsole theGame) {
        this.game = theGame;
    }

    public void run(){
        System.out.println("Running the game: " + game);

        game.Attack();
        game.Jump();
    }


}
