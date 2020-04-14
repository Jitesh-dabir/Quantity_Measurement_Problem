public class Temperature extends MeasurementAdapter {
    @Override
    public double getMeasurementValue(double unitValue, MeasurementUnits measurementType) throws QuantityMeasurementException {
        double fahrenheitToCelsius = 5.0 / 9.0, celsiusToFahrenheit = 9.0 / 5.0;
        switch (measurementType) {
            case FAHRENHEIT_TO_CELSIUS:
                return super.getMeasurementValue(unitValue, fahrenheitToCelsius, measurementType);
            case CELSIUS_TO_FAHRENHEIT:
                return super.getMeasurementValue(unitValue, celsiusToFahrenheit, measurementType);
        }
        return 0;
    }
}
