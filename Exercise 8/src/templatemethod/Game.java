package templatemethod;

public abstract class Game {

    protected abstract void initGame(int playerCount);
    protected abstract void play(int player);
    protected abstract boolean endGame();
    protected abstract void printWinner();

    public final void playOneGame(int playersCount) {
        initGame(playersCount);
        int j = 0;
        while (!endGame()){
            play(j + 1);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }

}
