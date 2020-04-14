public abstract class MeasurementAdapter {

    public abstract double getMeasurementValue(double unit, MeasurementUnits measurementType) throws QuantityMeasurementException;

    //METHOD TO GET CONVERSIONS
    public double getMeasurementValue(double unitValue, double typeValue, MeasurementUnits measurementType) throws QuantityMeasurementException {
        switch (measurementType) {
            case FAHRENHEIT_TO_CELSIUS:
                return (unitValue - 32) * typeValue;
            case CELSIUS_TO_FAHRENHEIT:
                return (unitValue * typeValue) + 32;
            default:
                return (unitValue * typeValue);
        }
    }
}
