package week1;

import java.util.Scanner;

public class GameManager {
    RandomNumberGeneration randomNumberGeneration = new RandomNumberGeneration();
    Scanner scanner = new Scanner(System.in);
    BaseballGame baseballGame = new BaseballGame();
    public void gameStart(){
        String randomNum = String.valueOf(randomNumberGeneration.getRandomNumber());
        while(true) {
            boolean clear = baseballGame.compareNum(randomNum);
            if(clear){
                return;
            }
    }
    }
}
