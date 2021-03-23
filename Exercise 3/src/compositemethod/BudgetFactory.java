package compositemethod;

public class BudgetFactory implements IFactory{
    @Override
    public IComputerPart createComputer() {
        IComputerPart graphicsCard = new GraphicscardMSI(); // 102.90 €
        IComputerPart memory = new MemoryRipjaws();         // 66.90 €
        IComputerPart netCard = new NetCardTP();            // 11.50 €
        IComputerPart processor = new ProcessorAMD();       // 94.90 €

        MotherboardMSI motherboard = new MotherboardMSI();  // 119.90 €
        motherboard.addComponent(graphicsCard);
        motherboard.addComponent(memory);
        motherboard.addComponent(netCard);
        motherboard.addComponent(processor);

        CasingFractal casing = new CasingFractal();         // 51.90 €
        casing.addComponent(motherboard);

        return casing;                                      // Total: 448 €
    }
}
