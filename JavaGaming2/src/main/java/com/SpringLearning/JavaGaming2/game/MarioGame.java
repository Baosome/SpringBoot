package com.SpringLearning.JavaGaming2.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole{
    public MarioGame(){
        
    }

    public void Jump(){
        System.out.println("Mario Jump!");
    }

    public void Attack() {
        System.out.println("Mario Attack!");
    }
}
