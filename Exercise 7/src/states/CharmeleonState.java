package states;

public class CharmeleonState implements IEvolutionState {

    private static CharmeleonState instance;

    private CharmeleonState() {}

    public static CharmeleonState getInstance(){
        if(instance == null)
            instance = new CharmeleonState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println(Gallery.getCharizard());
        System.out.println("\u001B[33m Congratulations! " + evolutionName() + " has evolved into a " +
                CharizardState.getInstance().evolutionName() + "! \u001B[0m");
        pokemon.setEvolutionState(CharizardState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Fire Fang", 240);
    }

    @Override
    public Move move2() {
        return new Move("Slash", 210);
    }

    @Override
    public Move move3() {
        return new Move("Flamethrower", 400);
    }

    @Override
    public Move move4() {
        return new Move("Dragon Rush",380);
    }

    @Override
    public String evolutionName() {
        return "Charmeleon";
    }

    @Override
    public int evolutionStage() {
        return 2;
    }
}
