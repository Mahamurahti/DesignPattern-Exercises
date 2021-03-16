package factorymethod;

public class Opiskelija extends AterioivaOtus{

    public Opiskelija(){ setNimi("Opiskelija Ossi"); }

    public Juoma createJuoma() { return new Limu(); }

    public Ruoka createRuoka(){ return new Makkara(); }

}
