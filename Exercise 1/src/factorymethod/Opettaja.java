package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Opettaja(){ setNimi("Opettaja Outi"); }

    public Juoma createJuoma(){ return new Vesi(); }

    public Ruoka createRuoka(){ return new Salaatti(); }

}
