package Builder;

import util.MyUtils;

public class ThinPersonBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        MyUtils.print("Small head");
    }

    @Override
    public void buildLeftArm() {
        MyUtils.print("Thin left arm");
    }

    @Override
    public void buildRightArm() {
        MyUtils.print("Thin right arm");
    }

    @Override
    public void buildLeftLeg() {
        MyUtils.print("Thin left leg");
    }

    @Override
    public void buildRightLeg() {
        MyUtils.print("Thin right leg");
    }
}
