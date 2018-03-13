package SimpleFactory;

public class OperationFactory {
    public enum Operator {
        ADD,
        MINUS,
        MULTIPLY,
        DIVIDE
    }

    public static IOperation makeOperation(Operator operator) throws Exception {
        switch (operator) {
            case ADD:
                return new AddIOperation();
            case MINUS:
                return new MinusIOperation();
            case MULTIPLY:
                return new MultiplyIOperation();
            case DIVIDE:
                return new DivideIOperation();
            default:
                throw new Exception("Unrecognised operator");
        }
    }
}
