package Facade;

import util.MyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fund {
    private String mName;
    private List<Stock> mStocks;
    private List<Bond> mBonds;

    Fund(String name) {
        mName = name;
        mStocks = new ArrayList<>();
        mBonds = new ArrayList<>();
    }

    void buy() {
        MyUtils.print("Fund " + mName + " bought: ");
        for (Stock stock : mStocks) {
            stock.buy();
        }

        for (Bond bond : mBonds) {
            bond.buy();
        }
    }

    void sell() {
        MyUtils.print("Fund " + mName + " sold: ");
        for (Stock stock : mStocks) {
            stock.sell();
        }

        for (Bond bond : mBonds) {
            bond.sell();
        }
    }

    void addStocks(Stock... stocks) {
        mStocks.addAll(Arrays.asList(stocks));
    }

    void addBonds(Bond... bonds) {
        mBonds.addAll(Arrays.asList(bonds));
    }
}
