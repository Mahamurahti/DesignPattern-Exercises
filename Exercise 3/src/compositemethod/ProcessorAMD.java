package compositemethod;

public class ProcessorAMD implements IComputerPart{
    @Override
    public double getPrice() {
        return 94.90;
    }

    @Override
    public String getPart() {
        return "(AMD Ryzen 3 3200G)";
    }
}
