package Strategy;

public class Context {
    private IStrategy mStrategy;

    public Context(String strategy) {
        switch (strategy) {
            case "正常收费":
                mStrategy = StrategyFactory.makeNoOpStrategy();
                break;
            case "满200减100":
                mStrategy = StrategyFactory.makeCashReturnStrategy(200, 100);
                break;
            case "打8折":
                mStrategy = StrategyFactory.makeDiscountStrategy(0.8);
                break;
            default:
                mStrategy = StrategyFactory.makeNoOpStrategy();
                break;
        }
    }

    public double getPriceAfterStrategy(double rawPrice) {
        return mStrategy.getPriceAfterStrategy(rawPrice);
    }
}
