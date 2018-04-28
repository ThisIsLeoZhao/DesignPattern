package State;

public interface IState {
    void handle(final StateContext context);
    default void show(final StateContext context) {
        System.out.println(this.getClass().getSimpleName() + ": " + context.getTime());
    }
}
