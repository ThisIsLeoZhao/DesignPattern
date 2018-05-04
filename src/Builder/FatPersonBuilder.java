package Builder;

import util.MyUtils;

public class FatPersonBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        MyUtils.print("Big head");
    }

    @Override
    public void buildLeftArm() {
        MyUtils.print("Fat left arm");
    }

    @Override
    public void buildRightArm() {
        MyUtils.print("Fat right arm");
    }

    @Override
    public void buildLeftLeg() {
        MyUtils.print("Fat left leg");
    }

    @Override
    public void buildRightLeg() {
        MyUtils.print("Fat right leg");
    }
}