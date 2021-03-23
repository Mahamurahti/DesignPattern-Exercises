package compositemethod;

public class ExpensiveFactory implements IFactory{
    @Override
    public IComputerPart createComputer() {
        IComputerPart graphicsCard = new GraphicscardASUS();    // 399.90 €
        IComputerPart memory = new MemoryKingston();            // 96.90 €
        IComputerPart netCard = new NetCardD();                 // 12.90 €
        IComputerPart processor = new ProcessorIntel();         // 219.90 €

        MotherboardASUS motherboard = new MotherboardASUS();    // 139.90 €
        motherboard.addComponent(graphicsCard);
        motherboard.addComponent(memory);
        motherboard.addComponent(netCard);
        motherboard.addComponent(processor);

        CasingCorsair casing = new CasingCorsair();             // 69.90 €
        casing.addComponent(motherboard);

        return casing;                                          // Total: 939.4 €
    }
}
