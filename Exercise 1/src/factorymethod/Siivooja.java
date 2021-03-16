package factorymethod;

public class Siivooja extends AterioivaOtus{

    public Siivooja(){ setNimi("Siivooja Santeri"); }

    public Juoma createJuoma(){ return new Tee(); }

    public Ruoka createRuoka(){ return new Donitsi(); }

}
