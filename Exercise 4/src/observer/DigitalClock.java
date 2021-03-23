package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
