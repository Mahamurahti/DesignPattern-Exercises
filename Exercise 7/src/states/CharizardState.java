package states;

public class CharizardState implements IEvolutionState {

    private static CharizardState instance;

    private CharizardState() {}

    public static CharizardState getInstance(){
        if(instance == null)
            instance = new CharizardState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("This pokemon can't evolve anymore and is at its maximum level!");
    }

    @Override
    public Move move1() {
        return new Move("Fire Spin", 500);
    }

    @Override
    public Move move2() {
        return new Move("Inferno", 550);
    }

    @Override
    public Move move3() {
        return new Move("Flare Blitz", 680);
    }

    @Override
    public Move move4() {
        return new Move("Dragon Claw", 640);
    }

    @Override
    public String evolutionName() {
        return "Charizard";
    }

    @Override
    public int evolutionStage() {
        return 3;
    }
}
