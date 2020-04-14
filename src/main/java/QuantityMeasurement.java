import java.util.Objects;

public class QuantityMeasurement {

    private final double unitValue;
    MeasurementUnits measurementType;
    double measurementValue;


    public QuantityMeasurement() {
        this.unitValue = 0;
    }

    //PARAMETER CONSTRUCTOR
    public QuantityMeasurement(MeasurementUnits measurementType, double unitValue) {
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
        return Objects.hash(unitValue, measurementType);
    }

    public double getMeasurementValue() throws QuantityMeasurementException {
        measurementValue = MeasurementAdapterFactory.getQuantityObject(unitValue, measurementType);
        return measurementValue;
    }

    public boolean compare(QuantityMeasurement type) throws QuantityMeasurementException {
        if (this.measurementType.getType() != type.measurementType.getType())
            throw new QuantityMeasurementException(QuantityMeasurementException.MyException.WRONG_TYPES, "You entered wrong type");
        return true;
    }

    public double additionOfMeasurement(QuantityMeasurement that) throws QuantityMeasurementException {
        if (this.measurementType.getType() == MeasurementUnitTypes.TEMPERATURE && that.measurementType.getType() == MeasurementUnitTypes.TEMPERATURE)
            throw new QuantityMeasurementException(QuantityMeasurementException.MyException.ADDITION_NOT_POSSIBLE, "You can't add temperature");
        return this.measurementValue + that.measurementValue;
    }
}