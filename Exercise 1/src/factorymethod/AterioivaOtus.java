package factorymethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;
    Ruoka ruoka = null;
    String nimi = null;

    public abstract Juoma createJuoma();
    public abstract Ruoka createRuoka();

    public void aterioi(){
        puhuja();
        syö();
        juo();
    }

    public void puhuja(){
        System.out.println("\n" + this.nimi + ":");
    }

    public void syö(){
        if(ruoka == null)
            ruoka = createRuoka();
        System.out.println("Kylläpä " + ruoka + " maistuukin hyvältä");
    }

    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }

    public void setNimi(String nimi){
        this.nimi = nimi;
    }
}
