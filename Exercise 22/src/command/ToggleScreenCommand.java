package command;

public class ToggleScreenCommand implements Command{

    private final Screen screen;

    public ToggleScreenCommand(Screen screen){
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.toggleScreen();
    }
}
