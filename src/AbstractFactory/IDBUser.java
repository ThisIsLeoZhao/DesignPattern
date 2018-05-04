package AbstractFactory;

public interface IDBUser {
    default void insert(User user) {
        System.out.println("Insert " + user.toString() + " to " + this);
    }

    default void get(String name) {
        System.out.println("Get " + name + " from " + this);
    }
}
