package Observer;

import java.util.Observable;
import java.util.Observer;

public class Colleague implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this + " - Notification from " + o + ": " + arg);
    }
}
