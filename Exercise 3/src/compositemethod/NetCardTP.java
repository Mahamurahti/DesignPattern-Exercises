package compositemethod;

public class NetCardTP implements IComputerPart{
    @Override
    public double getPrice() {
        return 11.50;
    }

    @Override
    public String getPart() {
        return "(TP-Link)";
    }
}
