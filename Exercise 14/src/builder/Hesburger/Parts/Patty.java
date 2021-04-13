package builder.Hesburger.Parts;

public class Patty implements IHamburgerPart{

    private String name;

    public Patty(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
