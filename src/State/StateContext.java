package State;

public class StateContext {
    private IState mState;
    private int mTime;
    private boolean mWorkFinished;

    StateContext() {
        mState = new MorningState();
    }

    StateContext(IState state) {
        mState = state;
    }

    public void setState(IState state) {
        mState = state;
    }

    public IState getState() {
        return mState;
    }

    void request() {
        mState.handle(this);
    }

    public int getTime() {
        return mTime;
    }

    public void setTime(int time) {
        mTime = time;
    }

    public boolean getWorkFinished() {
        return mWorkFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        mWorkFinished = workFinished;
    }
}
