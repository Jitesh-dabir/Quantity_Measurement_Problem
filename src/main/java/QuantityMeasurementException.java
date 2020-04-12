public class QuantityMeasurementException extends Exception {
    enum MyException {
        NULL_VALUE;
    }

    MyException type;

    QuantityMeasurementException(MyException type, String message) {
        super(message);
        this.type = type;
    }
}
