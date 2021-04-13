package builder.Hesburger.Parts;

public class Extra implements IHamburgerPart{

    private String name;

    public Extra(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
