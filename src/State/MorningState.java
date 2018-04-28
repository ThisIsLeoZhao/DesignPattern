package State;

public class MorningState implements IState {
    @Override
    public void handle(StateContext context) {
        if (context.getTime() > 12) {
            context.setState(new NoonState());
            context.request();
        }
    }

//    @Override
//    public void show() {
////        System.out.println("Morning");
//    }
}
