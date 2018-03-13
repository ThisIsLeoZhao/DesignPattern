package SimpleFactory;

public class Calculator {

    public static double calculate(OperationFactory.Operator operator, String op1, String op2) throws Exception {
        return OperationFactory.makeOperation(operator).calculate(Double.parseDouble(op1), Double.parseDouble(op2));
    }
}
