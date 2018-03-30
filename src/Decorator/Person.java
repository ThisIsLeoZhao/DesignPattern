package Decorator;

public class Person implements IPerson {
    private String mName;

    Person(String name) {
        mName = name;
    }

    @Override
    public void display() {
        System.out.println("Person " + mName + " wears:");
    }
}
