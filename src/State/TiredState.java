package State;

public class TiredState implements IState {
    @Override
    public void handle(StateContext context) {
        if (context.getTime() > 21) {
            context.setState(new SleepState());
            context.request();
        } else if (context.getWorkFinished()) {
            context.setState(new AfterworkState());
            context.request();
        }
    }

//    @Override
//    public void show() {
//        System.out.println("TiredState");
//    }
}
