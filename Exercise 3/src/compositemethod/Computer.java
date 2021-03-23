package compositemethod;

public class Computer {

    private IComputerPart computer;

    public IComputerPart getComputer() {
        return computer;
    }

    public void setComputer(IComputerPart computer) {
        this.computer = computer;
    }
}
