package builder.Hesburger.Parts;

public class Bun implements IHamburgerPart{

    private String name;
    private boolean top;

    public Bun(String name, boolean top){
        this.name = name;
        this.top = top;
    }

    @Override
    public String toString(){
        return " " + this.name + " " + (top ? "on top " : "at bottom ");
    }

}
