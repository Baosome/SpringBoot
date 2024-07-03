package com.SpringLearning.JavaGaming.game;

public class GameRunner {

    private GameConsole game;

    public GameRunner(GameConsole theGame) {
        this.game = theGame;
    }

    public void run(){
        System.out.println("Running the game: " + game);

        game.Attack();
        game.Jump();
    }


}
