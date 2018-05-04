package State;

public class Work {
    private boolean mWorkFinished;

    void finishWork(boolean finish) {
        mWorkFinished = finish;
    }

    void doWork(int time) {
        if (time < 12) {
            printState("morning");
        } else if (time < 14) {
            printState("noon");
        } else if (time < 18) {
            printState("afternoon");
        } else {
            if (mWorkFinished) {
                printState("afterWork");
            } else {
                if (time < 21) {
                    printState("tired");
                } else {
                    printState("sleep");
                }
            }
        }
    }

    private void printState(String state) {
        System.out.println(state);
    }
}
