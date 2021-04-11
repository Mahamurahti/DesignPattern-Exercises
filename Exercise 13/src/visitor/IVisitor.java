package visitor;

import visitor.bulbasaurLine.BulbasaurState;
import visitor.bulbasaurLine.IvysaurState;
import visitor.bulbasaurLine.VenusaurState;
import visitor.squirtleLine.BlastoiseState;
import visitor.squirtleLine.SquirtleState;
import visitor.squirtleLine.WartortleState;

public interface IVisitor {
    public int visit(BulbasaurState bulbasaurState);
    public int visit(IvysaurState ivysaurState);
    public int visit(VenusaurState venusaurState);

    public int visit(SquirtleState squirtleState);
    public int visit(WartortleState wartortleState);
    public int visit(BlastoiseState blastoiseState);
}
