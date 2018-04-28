package AbstractFactory;

public class Department {
    private String mName;

    Department(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
