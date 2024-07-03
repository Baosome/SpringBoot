package com.SpringLearning.JavaGaming2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanQualifier")
public class PacManGame implements GameConsole{
    public PacManGame() {
        
    }

    public void Jump(){
        System.out.println("Pacman Can't Jump!");
    }

    public void Attack() {
        System.out.println("Eats!");
    }
}
