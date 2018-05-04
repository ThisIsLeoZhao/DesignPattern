package Builder;

public class PersonBuilderDirector {
    private PersonBuilder mPersonBuilder;

    public PersonBuilderDirector(PersonBuilder personBuilder) {
        mPersonBuilder = personBuilder;
    }

    public void build() {
        mPersonBuilder.buildHead();
        mPersonBuilder.buildLeftArm();
        mPersonBuilder.buildRightArm();
        mPersonBuilder.buildLeftLeg();
        mPersonBuilder.buildRightLeg();
    }
}
