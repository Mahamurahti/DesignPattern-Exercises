package abstractmethod;

public class AdidasFactory implements IFactory{

    @Override
    public String createHat() {
        return new AdidasHat().toString();
    }

    @Override
    public String createShirt() {
        return new AdidasShirt().toString();
    }

    @Override
    public String createPants() {
        return new AdidasPants().toString();
    }

    @Override
    public String createShoes() {
        return new AdidasShoes().toString();
    }
}
