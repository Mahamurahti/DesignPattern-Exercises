package visitor.bulbasaurLine;

import visitor.IIEvolutionState;
import visitor.IVisitor;
import visitor.Move;
import visitor.Pokemon;

public class VenusaurState implements IIEvolutionState {

    private static VenusaurState instance;

    private VenusaurState() {}

    public static VenusaurState getInstance(){
        if(instance == null)
            instance = new VenusaurState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("This pokemon can't evolve anymore and is at its maximum level!");
    }

    @Override
    public Move move1() {
        return new Move("Solar Beam", 820);
    }

    @Override
    public Move move2() {
        return new Move("Synthesis", 600);
    }

    @Override
    public Move move3() {
        return new Move("Magical Leaf", 740);
    }

    @Override
    public Move move4() {
        return new Move("Venoshock", 690);
    }

    @Override
    public String evolutionName() {
        return "Venusaur";
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
