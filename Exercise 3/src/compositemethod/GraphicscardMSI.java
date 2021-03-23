package compositemethod;

public class GraphicscardMSI implements IComputerPart{
    @Override
    public double getPrice() {
        return 102.90;
    }

    @Override
    public String getPart() {
        return "(MSI GeForce GT 1030)";
    }
}
