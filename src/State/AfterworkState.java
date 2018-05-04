package State;

public class AfterworkState implements IState {
    @Override
    public void handle(StateContext context) {
        if (context.getTime() > 21) {
            context.setState(new SleepState());
            context.request();
        }
    }

//    @Override
//    public void show() {
////        System.out.println("AfterworkState");
//    }
}
