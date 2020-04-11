public class QuantityMeasurement {

    Lengths measurementType;
    double conversionResult;

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
        switch (measurementType) {
            case FAHRENHEIT_TO_CELSIUS:
                conversionResult = (feetValue - 32) * measurementType.value;
                break;
            case CELSIUS_TO_FAHRENHEIT:
                conversionResult = (feetValue * measurementType.value) + 32;
                break;
            default:
                conversionResult = (feetValue * measurementType.value);
                break;
        }
        return conversionResult;

    }
}