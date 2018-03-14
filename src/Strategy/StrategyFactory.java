package Strategy;

public class StrategyFactory {
    public static IStrategy makeNoOpStrategy() {
        return new NoOpStrategy();
    }

    public static IStrategy makeDiscountStrategy(double discountRate) {
        return new DiscountStrategy(discountRate);
    }

    public static IStrategy makeCashReturnStrategy(double returnBase, double returnAmount) {
        return new CashReturnStrategy(returnBase, returnAmount);
    }
}
