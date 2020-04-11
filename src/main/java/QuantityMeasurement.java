public class QuantityMeasurement {

    Lengths measurementType;

    public QuantityMeasurement(Lengths measurementType) {
        this.measurementType = measurementType;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        else if (object == this)
            return true;
        else if (object.getClass() == this.getClass())
            return true;
        else
            return super.equals(object);
    }

    public double getMeasurementValue(double feetValue) {
        if (measurementType.equals(Lengths.FAHRENHEIT_TO_CELSIUS))
            return (feetValue - 32) * measurementType.value;
        return (feetValue * measurementType.value);
    }
}