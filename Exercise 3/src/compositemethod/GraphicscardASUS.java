package compositemethod;

public class GraphicscardASUS implements IComputerPart{
    @Override
    public double getPrice() {
        return 399.90;
    }

    @Override
    public String getPart() {
        return "(ASUS TUF 3-GTX1660S)";
    }
}
