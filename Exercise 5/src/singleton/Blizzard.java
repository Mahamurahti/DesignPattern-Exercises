package singleton;

import java.util.ArrayList;

public class Blizzard implements IGameIndustry{

    private String name;
    private ArrayList<String> plannedGames;

    public Blizzard(){
        name = "Blizzard Entertainment";
        plannedGames = new ArrayList<>();
    }

    @Override
    public void sendGameToBeMarketed() {
        Games.getInstance().addGame(plannedGames.remove(0));
    }

    @Override
    public void cancelGame(String name) {
        if(Games.getInstance().deleteGame(name))
            System.out.println(this.name + " cancelled " + name + ".");
        else
            System.out.println(this.name + " tried to cancel a non-existent game.");
    }

    @Override
    public void planGames() {
        plannedGames.add("World of Warcraft");
        plannedGames.add("Overwatch");
        plannedGames.add("Hearthstone");
        plannedGames.add("Diablo");
        plannedGames.add("StarCraft");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
