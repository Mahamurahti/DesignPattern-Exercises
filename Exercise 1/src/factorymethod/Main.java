package factorymethod;

public class Main {
    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus siivooja = new Siivooja();

        opettaja.aterioi();
        opiskelija.aterioi();
        siivooja.aterioi();
    }
}
