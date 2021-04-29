package command;

public class WallButton {
    private final Command command;

    public WallButton(Command command){
        this.command = command;
    }

    public void push(){
        command.execute();
    }
}
