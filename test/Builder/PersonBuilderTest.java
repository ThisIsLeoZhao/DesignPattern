package Builder;

import org.junit.jupiter.api.Test;

class PersonBuilderTest {
    @Test
    public void test() {
        new PersonBuilderDirector(new ThinPersonBuilder()).build();
        new PersonBuilderDirector(new FatPersonBuilder()).build();
    }

}