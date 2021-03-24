package singleton;

public class Main {
    public static void main(String[] args){
        IGameIndustry blizzard = new Blizzard();
        IGameIndustry bethesda = new Bethesda();

        IGameStore steam = new Steam();
        IGameStore gameStop = new GameStop();

        System.out.println("\nGame industry example of singleton:");

        blizzard.planGames();
        bethesda.planGames();

        System.out.printf("\n%s got good ideas, they made three games...\n", blizzard.getName());

        for(int i = 0; i < 3; i++)
            blizzard.sendGameToBeMarketed();

        System.out.printf("\n%s agreed that %s will market all their three games.\n", blizzard.getName(), steam.getName());

        for(int i = 0; i < 3; i++)
            steam.marketGame();

        System.out.printf("\nBoth %s and %s have had a good idea streak, they have both made two games...\n",
                            blizzard.getName(), bethesda.getName());

        for(int i = 0; i < 2; i++)
            blizzard.sendGameToBeMarketed();

        for(int i = 0; i < 2; i++)
            bethesda.sendGameToBeMarketed();

        System.out.printf("\n%s wanted that %s will market one of their games and that %s will market the other. " +
                            "%s has agreed to %s to market all of their games.\n", blizzard.getName(), steam.getName(),
                            gameStop.getName(), bethesda.getName(), gameStop.getName());

        steam.marketGame();
        for(int i = 0; i < 3; i++)
            gameStop.marketGame();

        System.out.printf("\n%s is out of ideas. %s has made a whopping amount of four games!\n",
                            blizzard.getName(), bethesda.getName());

        for(int i = 0; i < 4; i++)
            bethesda.sendGameToBeMarketed();

        System.out.printf("\n%s wants %s to market three of the four games and %s to market the last game.\n",
                        bethesda.getName(), steam.getName(), gameStop.getName());

        for(int i = 0; i < 3; i++)
            steam.marketGame();

        gameStop.marketGame();
    }
}
