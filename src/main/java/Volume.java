public class Volume extends MeasurementAdapter {
    @Override
    public double getMeasurementValue(double unitValue, MeasurementUnits measurementType) throws QuantityMeasurementException {
        double gallon = 1.0, liter = 1.0, gallonToLiter = 3.78, literToGallon = 1 / 3.78,
                milliliterToLiter = 1 / 1000.0, literToMilliliter = 1000.0;
        switch (measurementType) {
            case GALLON:
                return super.getMeasurementValue(unitValue, gallon, measurementType);
            case LITER:
                return super.getMeasurementValue(unitValue, liter, measurementType);
            case GALLON_TO_LITRES:
                return super.getMeasurementValue(unitValue, gallonToLiter, measurementType);
            case LITRES_TO_GALLON:
                return super.getMeasurementValue(unitValue, literToGallon, measurementType);
            case LITER_TO_MILLILITER:
                return super.getMeasurementValue(unitValue, literToMilliliter, measurementType);
            case MILLILITER_TO_LITER:
                return super.getMeasurementValue(unitValue, milliliterToLiter, measurementType);
        }
        return 0;
    }
}
