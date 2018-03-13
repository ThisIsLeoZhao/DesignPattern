package SimpleFactory;

public class DivideIOperation implements IOperation {
    @Override
    public double calculate(Double... ops) {
        return ops[0] / ops[1];
    }
}
