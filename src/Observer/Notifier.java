package Observer;

import java.util.Observable;

public class Notifier extends Observable {
    void sendNotification(String notification) {
        setChanged();
        notifyObservers(notification);
    }
}
