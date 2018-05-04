package AbstractFactory;

public class User {
    private String mName;
    User(String name) {
        mName = name;
    }

    String getName() {
        return mName;
    }
}
