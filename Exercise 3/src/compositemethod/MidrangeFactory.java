package compositemethod;

public class MidrangeFactory implements IFactory{
    @Override
    public IComputerPart createComputer() {
        IComputerPart graphicsCard = new GraphicscardASUS();    // 399.90 €
        IComputerPart memory = new MemoryRipjaws();             // 66.90 €
        IComputerPart netCard = new NetCardD();                 // 12.90 €
        IComputerPart processor = new ProcessorAMD();           // 94.90 €

        MotherboardASUS motherboard = new MotherboardASUS();    // 139.90 €
        motherboard.addComponent(graphicsCard);
        motherboard.addComponent(memory);
        motherboard.addComponent(netCard);
        motherboard.addComponent(processor);

        CasingFractal casing = new CasingFractal();             // 51.90 €
        casing.addComponent(motherboard);

        return casing;                                          // Total: 766.4 €
    }
}
