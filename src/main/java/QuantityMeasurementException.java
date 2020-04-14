public class QuantityMeasurementException extends Exception {
    enum MyException {
        NULL_VALUE, WRONG_TYPES, ADDITION_NOT_POSSIBLE;
    }

    MyException type;

    public QuantityMeasurementException(MyException type, String message) {
        super(message);
        this.type = type;
    }
}
