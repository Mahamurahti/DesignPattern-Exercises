package singleton;

public class GameStop implements IGameStore{

    private String name;

    public GameStop(){
        name = "GameStop";
    }

    @Override
    public void marketGame() {
        System.out.println(name + " just marketed a game called " + Games.getInstance().publishGame());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
