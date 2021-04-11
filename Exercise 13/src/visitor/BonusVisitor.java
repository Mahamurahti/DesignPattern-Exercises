package visitor;

import visitor.bulbasaurLine.*;
import visitor.squirtleLine.*;

public class BonusVisitor implements IVisitor{

    @Override
    public int visit(BulbasaurState bulbasaurState) {
        System.out.println("Granting " + bulbasaurState.evolutionName() + " " + bulbasaurState.evolutionStage() * 110 +
                " bonus experience!");
        return bulbasaurState.evolutionStage() * 110;
    }

    @Override
    public int visit(IvysaurState ivysaurState) {
        System.out.println("Granting " + ivysaurState.evolutionName() + " " + ivysaurState.evolutionStage() * 140 +
                " bonus experience!");
        return ivysaurState.evolutionStage() * 140;
    }

    @Override
    public int visit(VenusaurState venusaurState) {
        System.out.println("Granting " + venusaurState.evolutionName() + " " + venusaurState.evolutionStage() * 200 +
                " bonus experience!");
        return venusaurState.evolutionStage() * 200;
    }

    @Override
    public int visit(SquirtleState squirtleState) {
        System.out.println("Granting " + squirtleState.evolutionName() + " " + squirtleState.evolutionStage() * 120 +
                " bonus experience!");
        return squirtleState.evolutionStage() * 120;
    }

    @Override
    public int visit(WartortleState wartortleState) {
        System.out.println("Granting " + wartortleState.evolutionName() + " " + wartortleState.evolutionStage() * 130 +
                " bonus experience!");
        return wartortleState.evolutionStage() * 130;
    }

    @Override
    public int visit(BlastoiseState blastoiseState) {
        System.out.println("Granting " + blastoiseState.evolutionName() + " " + blastoiseState.evolutionStage() * 190 +
                " bonus experience!");
        return blastoiseState.evolutionStage() * 190;
    }
}
