package Decorator;

// Declared abstract so that it can not be instantiated
public abstract class Cloth implements IPerson {
    private IPerson mPerson;

    void wearOn(IPerson person) {
        mPerson = person;
    }

    @Override
    public void display() {
        if (mPerson != null) {
            mPerson.display();
        }
    }
}
