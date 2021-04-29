package command;

public class Screen {

    private boolean isScreenUp = true;

    public void toggleScreen(){
        isScreenUp = !isScreenUp;
        System.out.println("Screen is now " + (isScreenUp ? "up" : "down"));
    }

}
