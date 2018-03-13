package Strategy;

public class StrategyFactory {
    public IStrategy makeDiscountStrategy(double discountRate) {
        return new DiscountStrategy(discountRate);
    }

    public IStrategy makeCashReturnStrategy(double returnBase, double returnAmount) {
        return new CashReturnStrategy(returnBase, returnAmount);
    }
}
