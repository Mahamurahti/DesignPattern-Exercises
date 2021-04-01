package templatemethod;

import java.util.Scanner;

public class GuessTheNumber extends Game{

    private int randomNum;
    private boolean isDone = false;
    private int winner;

    @Override
    protected void initGame(int playerCount) {
        System.out.println("You chose Guess the number!");
        System.out.println("Here you have to guess a randomly generated whole number between 1-10!");
        randomNum = (int)Math.round(Math.random() * 10);
    }

    @Override
    protected void play(int player) {
        System.out.println("Player " + player + " pick your number:");
        int yourNum = Read.readInt();
        if(yourNum == randomNum){
            System.out.println("Correct!");
            winner = player;
            isDone = true;
        }else{
            System.out.println("Wrong!");
        }
    }

    @Override
    protected boolean endGame() {
        return isDone;
    }

    @Override
    protected void printWinner() {
        System.out.println("Player " + winner + " wins!");
    }
}
