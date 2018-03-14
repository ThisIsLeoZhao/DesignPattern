package Strategy;

public class NoOpStrategy implements IStrategy {
    @Override
    public double getPriceAfterStrategy(double rawPrice) {
        return rawPrice;
    }
}
