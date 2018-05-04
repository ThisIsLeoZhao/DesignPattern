package Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void test() {
        Stock aapl = new Stock("AAPL");
        Stock ntes = new Stock("NTES");
        Stock htht = new Stock("HTHT");

        aapl.buy();
        ntes.buy();
        htht.buy();

        aapl.sell();
        ntes.sell();
        htht.sell();

        Bond us = new Bond("us");
        Bond china = new Bond("china");

        us.buy();
        us.sell();
        china.buy();
        china.sell();

        Fund fund = new Fund("blackrock");
        fund.addStocks(aapl, ntes, htht);
        fund.addBonds(us, china);
        fund.buy();
        fund.sell();
    }
}