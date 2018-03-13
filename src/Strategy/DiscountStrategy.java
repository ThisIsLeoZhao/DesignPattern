package Strategy;

public class DiscountStrategy implements IStrategy {
    private double mDiscount;

    public DiscountStrategy(double discount) {
        mDiscount = discount;
    }

    @Override
    public double getPriceAfterStrategy(double rawPrice) {
        return rawPrice * mDiscount;
    }
}
