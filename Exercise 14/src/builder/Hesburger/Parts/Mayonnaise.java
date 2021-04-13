package builder.Hesburger.Parts;

public class Mayonnaise implements IHamburgerPart{

    private String name;

    public Mayonnaise(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
