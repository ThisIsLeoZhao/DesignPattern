package State;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkTest {
    @Test
    void testSequentialStateTransition() {
        StateContext work = new StateContext(new MorningState());
        work.getState().show(work);
        work.setTime(11);
        work.request();
        work.getState().show(work);

        work.setTime(13);
        work.request();
        work.getState().show(work);

        work.setTime(15);
        work.request();
        work.getState().show(work);

        work.setTime(19);
        work.request();
        work.getState().show(work);

        work.setWorkFinished(true);
        work.setTime(20);
        work.request();
        work.getState().show(work);

        work.setTime(23);
        work.request();
        work.getState().show(work);
    }

    @Test
    void testSkipStateTransition() {
        StateContext work = new StateContext(new MorningState());
        work.getState().show(work);
        work.setTime(11);
        work.request();
        work.getState().show(work);

        work.setTime(19);
        work.request();
        work.getState().show(work);

        work.setWorkFinished(true);
        work.setTime(20);
        work.request();
        work.getState().show(work);

        work.setTime(23);
        work.request();
        work.getState().show(work);
    }
}