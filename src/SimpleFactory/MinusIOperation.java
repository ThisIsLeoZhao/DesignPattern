package SimpleFactory;

public class MinusIOperation implements IOperation {
    @Override
    public double calculate(Double... ops) {
        return ops[0] - ops[1];
    }
}
