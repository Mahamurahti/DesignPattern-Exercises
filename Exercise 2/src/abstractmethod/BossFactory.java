package abstractmethod;

public class BossFactory implements IFactory{

    @Override
    public String createHat() {
        return new BossHat().toString();
    }

    @Override
    public String createShirt() {
        return new BossShirt().toString();
    }

    @Override
    public String createPants() {
        return new BossPants().toString();
    }

    @Override
    public String createShoes() {
        return new BossShoes().toString();
    }
}
