package Strategy;

public class CashReturnStrategy implements IStrategy {
    private double mReturnBase;
    private double mReturnAmount;

    public CashReturnStrategy(double returnBase, double returnAmount) {
        mReturnBase = returnBase;
        mReturnAmount = returnAmount;
    }

    @Override
    public double getPriceAfterStrategy(double rawPrice) {
        return rawPrice - (int) (rawPrice / mReturnBase) * mReturnAmount;
    }
}
