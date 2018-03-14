package Strategy;

import java.util.Map;

public class PriceCalculator {
    public double calculatePrice(Map<Product, Integer> productMap, String strategy) {
        double totalPrice = 0;
        for (Product product : productMap.keySet()) {
            totalPrice += product.getPrice() * productMap.get(product);
        }

        Context context = new Context(strategy);
        return context.getPriceAfterStrategy(totalPrice);
    }
}
