package Strategy;

import java.util.Map;

public class PriceCalculator {
    public double calculatePrice(Map<Product, Integer> productMap) {
        double totalPrice = 0;
        for (Product product : productMap.keySet()) {
            totalPrice += product.getPrice() * productMap.get(product);
        }

        return totalPrice;
    }
}
