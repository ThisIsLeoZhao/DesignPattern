package State;

public class AfternoonState implements IState {
    @Override
    public void handle(StateContext context) {
        if (context.getTime() > 18) {
            if (context.getWorkFinished()) {
                context.setState(new AfterworkState());
                context.request();
            } else {
                context.setState(new TiredState());
                context.request();
            }
        }
    }

//    @Override
//    public void show() {
//        System.out.println("AfternoonState");
//    }
}
