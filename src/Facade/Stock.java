package Facade;

import util.MyUtils;

public class Stock {
    private String mCode;

    public Stock(String code) {
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
