package templatemethod;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to a two-player game hub with only two games.");

        Game game = null;
        char select;

        do{
            System.out.println("Choose your game:");
            System.out.println("\n\t\t\t1. Rock-paper-scissors");
            System.out.println("\t\t\t2. Guess the number");
            System.out.println("\t\t\t3. Exit");
            System.out.print("\n\n");
            select = Read.character();
            switch (select) {
                case '1':
                    game = new RockPaperScissor();
                    break;
                case '2':
                    game = new GuessTheNumber();
                    break;
                case '3':
                    break;
            }
            if(select != 3)
                game.playOneGame(2);
        }while (select != '3');
    }
}
