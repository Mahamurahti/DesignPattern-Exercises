package states;

public class CharmanderState implements IEvolutionState {

    private static CharmanderState instance;

    private CharmanderState() {}

    public static CharmanderState getInstance(){
        if(instance == null)
            instance = new CharmanderState();
        System.out.println(Gallery.getCharmander());
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println(Gallery.getCharmeleon());
        System.out.println("\u001B[33m Congratulations! " + evolutionName() + " has evolved into a " +
                CharmeleonState.getInstance().evolutionName() + "! \u001B[0m");
        pokemon.setEvolutionState(CharmeleonState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Growl", 100);
    }

    @Override
    public Move move2() {
        return new Move("Scratch", 120);
    }

    @Override
    public Move move3() {
        return new Move("Ember", 110);
    }

    @Override
    public Move move4() {
        return new Move("Dragon Breath", 150);
    }

    @Override
    public String evolutionName() {
        return "Charmander";
    }

    @Override
    public int evolutionStage() {
        return 1;
    }
}
