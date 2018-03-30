package Decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
    private IPerson mPerson;

    @BeforeEach
    public void setup() {
        mPerson = new Person("a");
    }

    @Test
    public void testNotWearTheSameClothMoreThanOnce() {
        Cloth b = new Shirt();
        Cloth c = new Trouser();

        b.wearOn(mPerson);
        c.wearOn(b);
        c.display();
    }
}