package Facade;

import util.MyUtils;

public class Bond {
    private String mCode;

    public Bond(String code) {
        mCode = code;
    }

    public void buy() {
        MyUtils.print("buy " + mCode);
    }

    public void sell() {
        MyUtils.print("sell " + mCode);
    }

    @Override
    public String toString() {
        return mCode;
    }
}
