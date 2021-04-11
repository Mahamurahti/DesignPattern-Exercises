package visitor.squirtleLine;

import visitor.*;

public class WartortleState implements IIEvolutionState {

    private static WartortleState instance;

    private WartortleState() {}

    public static WartortleState getInstance(){
        if(instance == null)
            instance = new WartortleState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println(Gallery.getBlastoise());
        System.out.println("\u001B[33m Congratulations! " + evolutionName() + " has evolved into a " +
                BlastoiseState.getInstance().evolutionName() + "! \u001B[0m");
        pokemon.setEvolutionState(BlastoiseState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Rain Dance", 510);
    }

    @Override
    public Move move2() {
        return new Move("Aqua Tail", 530);
    }

    @Override
    public Move move3() {
        return new Move("Shell Smash", 580);
    }

    @Override
    public Move move4() {
        return new Move("Dive", 650);
    }

    @Override
    public String evolutionName() {
        return "Wartortle";
    }

    @Override
    public int evolutionStage() {
        return 2;
    }

    @Override
    public int accept(IVisitor visitor){
        return visitor.visit(this);
    }
}
