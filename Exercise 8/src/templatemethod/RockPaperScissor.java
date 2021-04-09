package templatemethod;

public class RockPaperScissor extends Game{

    private enum Hands {
        ROCK, PAPER, SCISSOR
    }

    private int players;
    private Hands p1, p2;
    private boolean isDone = false;

    @Override
    protected void initGame(int playerCount) {
        System.out.println("You chose Rock-Paper-Scissors!");
        players = playerCount;
    }

    @Override
    protected void play(int player) {
        System.out.println("Player " + player + " pick your hand:");

        char select;
        System.out.println("\n\t\t\t1. ROCK");
        System.out.println("\t\t\t2. PAPER");
        System.out.println("\t\t\t3. SCISSOR");
        System.out.print("\n\n");
        select = Read.character();
        switch (select) {
            case '1':
                System.out.println("Player " + player + " chose " + Hands.ROCK.toString().toLowerCase());
                if(player == 1)
                    p1 = Hands.ROCK;
                else
                    p2 = Hands.ROCK;
                break;
            case '2':
                System.out.println("Player " + player + " chose " + Hands.PAPER.toString().toLowerCase());
                if(player == 1)
                    p1 = Hands.PAPER;
                else
                    p2 = Hands.PAPER;
                break;
            case '3':
                System.out.println("Player " + player + " chose " + Hands.SCISSOR.toString().toLowerCase());
                if(player == 1)
                    p1 = Hands.SCISSOR;
                else
                    p2 = Hands.SCISSOR;
                break;
        }
        if(player == players){
            isDone = true;
        }
    }

    @Override
    protected boolean endGame() {
        return isDone;
    }

    @Override
    protected void printWinner() {
        switch (p1){
            case ROCK:
                switch (p2){
                    case ROCK:
                        System.out.println("It's a tie");
                        break;
                    case PAPER:
                        System.out.println("Player 2 wins!");
                        break;
                    case SCISSOR:
                        System.out.println("Player 1 wins!");
                        break;
                }
                break;
            case PAPER:
                switch (p2){
                    case ROCK:
                        System.out.println("Player 1 wins!");
                        break;
                    case PAPER:
                        System.out.println("It's a tie!");
                        break;
                    case SCISSOR:
                        System.out.println("Player 2 wins!");
                        break;
                }
                break;
            case SCISSOR:
                switch (p2){
                    case ROCK:
                        System.out.println("Player 2 wins!");
                        break;
                    case PAPER:
                        System.out.println("Player 1 wins!");
                        break;
                    case SCISSOR:
                        System.out.println("It's a tie");
                        break;
                }
                break;
        }
    }
}
