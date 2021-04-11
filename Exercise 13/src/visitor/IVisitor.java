package visitor;

import visitor.bulbasaurLine.*;
import visitor.squirtleLine.*;

public interface IVisitor {
    public int visit(BulbasaurState bulbasaurState);
    public int visit(IvysaurState ivysaurState);
    public int visit(VenusaurState venusaurState);

    public int visit(SquirtleState squirtleState);
    public int visit(WartortleState wartortleState);
    public int visit(BlastoiseState blastoiseState);
}
