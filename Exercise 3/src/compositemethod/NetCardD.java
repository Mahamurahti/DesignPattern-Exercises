package compositemethod;

public class NetCardD implements IComputerPart{
    @Override
    public double getPrice() {
        return 12.90;
    }

    @Override
    public String getPart() {
        return "(D-Link)";
    }
}
