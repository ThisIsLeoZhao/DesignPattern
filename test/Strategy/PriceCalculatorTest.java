package Strategy;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {
    @Test
    void test() {
        Map<Product, Integer> products = new HashMap<>();
        products.put(new Product(1, 1.1), 2);
        products.put(new Product(2, 2.2), 2);
        products.put(new Product(3, 3), 1);
        products.put(new Product(4, 8.1), 2);
        products.put(new Product(5, 2.1), 3);

        PriceCalculator calculator = new PriceCalculator();
        assertEquals(32.1, calculator.calculatePrice(products));
    }
}