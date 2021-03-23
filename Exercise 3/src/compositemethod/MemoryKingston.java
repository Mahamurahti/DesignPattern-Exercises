package compositemethod;

public class MemoryKingston implements IComputerPart{
    @Override
    public double getPrice() {
        return 96.90;
    }

    @Override
    public String getPart() {
        return "(Kingston HyperX)";
    }
}
