package com.SpringLearning.JavaGaming;

import com.SpringLearning.JavaGaming.game.*;

public class GamingApp1 {
    public static void main(String[] args) {

        //var marioGame = new MarioGame();
        var pacManGame = new PacManGame();
        GameRunner gameRunner = new GameRunner(pacManGame);
        gameRunner.run();

    }

}
