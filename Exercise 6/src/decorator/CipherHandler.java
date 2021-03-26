package decorator;

public abstract class CipherHandler implements IFileHandling {
    private final IFileHandling handlerToBeDecorated;

    public CipherHandler(IFileHandling handlerToBeDecorated){
        this.handlerToBeDecorated = handlerToBeDecorated;
    }

    @Override
    public void write(String message) {
        handlerToBeDecorated.write(message);
    }

    @Override
    public void read() {
        handlerToBeDecorated.read();
    }

    @Override
    public String getDescription() {
        return handlerToBeDecorated.getDescription();
    }
}
