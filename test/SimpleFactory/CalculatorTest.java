package SimpleFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void testCalculate() throws Exception {
        assertEquals(2.3, Calculator.calculate(OperationFactory.Operator.ADD, "1.1", "1.2"), 0.00001);
        assertEquals(-0.1, Calculator.calculate(OperationFactory.Operator.MINUS, "1.1", "1.2"), 0.00001);
        assertEquals(1.32, Calculator.calculate(OperationFactory.Operator.MULTIPLY, "1.1", "1.2"), 0.00001);
        assertEquals(19, Calculator.calculate(OperationFactory.Operator.DIVIDE, "3.8", "0.2"), 0.00001);
    }

}