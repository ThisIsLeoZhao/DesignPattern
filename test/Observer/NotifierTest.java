package Observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {
    @Test
    void test() {
        Notifier notifier = new Notifier();
        notifier.addObserver(new Colleague());
        notifier.addObserver(new Colleague());
        notifier.addObserver(new Colleague());

        notifier.sendNotification("HEY");
    }
}