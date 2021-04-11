package visitor.squirtleLine;

import visitor.IIEvolutionState;
import visitor.IVisitor;
import visitor.Move;
import visitor.Pokemon;

public class BlastoiseState implements IIEvolutionState {

    private static BlastoiseState instance;

    private BlastoiseState() {}

    public static BlastoiseState getInstance(){
        if(instance == null)
            instance = new BlastoiseState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("This pokemon can't evolve anymore and is at its maximum level!");
    }

    @Override
    public Move move1() {
        return new Move("Hydro Pump", 700);
    }

    @Override
    public Move move2() {
        return new Move("Surf", 720);
    }

    @Override
    public Move move3() {
        return new Move("Scald", 710);
    }

    @Override
    public Move move4() {
        return new Move("Zen Headbutt", 720);
    }

    @Override
    public String evolutionName() {
        return "Blastoise";
    }

    @Override
    public int evolutionStage() {
        return 3;
    }

    @Override
    public int accept(IVisitor visitor){
        return visitor.visit(this);
    }
}
