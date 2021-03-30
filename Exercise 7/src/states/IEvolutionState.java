package states;

public interface IEvolutionState {
    public void evolve(Pokemon pokemon);
    public Move move1();
    public Move move2();
    public Move move3();
    public Move move4();
    public String evolutionName();
    public int evolutionStage();
}
