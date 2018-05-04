package State;

public class NoonState implements IState {
    @Override
    public void handle(StateContext context) {
        if (context.getTime() > 14) {
            context.setState(new AfternoonState());
            context.request();
        }
    }

//    @Override
//    public void show() {
//        System.out.println("Noon");
//    }
}
