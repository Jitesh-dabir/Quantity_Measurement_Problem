import java.util.Objects;

public class QuantityMeasurement {

    private final double unitValue;
    Lengths measurementType;
    double conversionResult;

    //PARAMETER CONSTRUCTOR
    public QuantityMeasurement(Lengths measurementType, double unitValue) {
        this.measurementType = measurementType;
        this.unitValue = unitValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.unitValue, unitValue) == 0 &&
                measurementType == that.measurementType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitValue, measurementType, conversionResult);
    }

    //METHOD TO GET CONVERSIONS
    public double getMeasurementValue() throws QuantityMeasurementException {
        if (measurementType == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.MyException.NULL_VALUE,"Null Measurement type");
        switch (measurementType) {
            case FAHRENHEIT_TO_CELSIUS:
                return (unitValue - 32) * measurementType.value;
            case CELSIUS_TO_FAHRENHEIT:
                return (unitValue * measurementType.value) + 32;
            default:
                return (unitValue * measurementType.value);
        }
    }
}