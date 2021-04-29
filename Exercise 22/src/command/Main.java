package command;

public class Main {
    public static void main(String[] args){

        Screen screen = new Screen();
        Command toggleScreen = new ToggleScreenCommand(screen);
        WallButton button = new WallButton(toggleScreen);

        System.out.println("Screen is now up, since the theater is not in use...");

        button.push();
        System.out.println("Since customers came, screen is now down to show them movies...");

        button.push();
        System.out.println("Screen was rolled up, because the movie ended...");

    }
}
