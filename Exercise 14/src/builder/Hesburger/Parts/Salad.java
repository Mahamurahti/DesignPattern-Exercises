package builder.Hesburger.Parts;

public class Salad implements IHamburgerPart{

    private String name;

    public Salad(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
