package singleton;

import java.util.ArrayList;

public class Bethesda implements IGameIndustry{

    private String name;
    private ArrayList<String> plannedGames;

    public Bethesda(){
        name = "Bethesda Softworks";
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
        plannedGames.add("Skyrim");
        plannedGames.add("Fallout");
        plannedGames.add("DOOM");
        plannedGames.add("Prey");
        plannedGames.add("Dishonored");
        plannedGames.add("Wolfenstein");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
