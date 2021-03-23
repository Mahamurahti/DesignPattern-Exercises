package compositemethod;

public class ProcessorIntel implements IComputerPart{
    @Override
    public double getPrice() {
        return 219.90;
    }

    @Override
    public String getPart() {
        return "(Intel Core i5-9600K)";
    }
}
