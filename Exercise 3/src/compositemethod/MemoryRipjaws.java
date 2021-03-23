package compositemethod;

public class MemoryRipjaws implements IComputerPart{
    @Override
    public double getPrice() {
        return 66.90;
    }

    @Override
    public String getPart() {
        return "(G.Skill Ripjaws)";
    }
}
