public class Length extends MeasurementAdapter {
    @Override
    public double getMeasurementValue(double unitValue, MeasurementUnits measurementType) throws QuantityMeasurementException {
        double feet = 1.0, inch = 1.0, inchToFeet = 1 / 12.0, feetToInch = 12.0,
                yard = 1.0, yardToFeet = 1 * 3.0, feetToYard = 1 / 3.0,
                inchToCentimeter = 2.54, centimeterToInch = 1 / 2.54,
                inchToYard = 1 / 36.0, yardToInch = 36.0;
        switch (measurementType) {
            case FEET:
                return super.getMeasurementValue(unitValue, feet, measurementType);
            case INCH:
                return super.getMeasurementValue(unitValue, inch, measurementType);
            case YARD:
                return super.getMeasurementValue(unitValue, yard, measurementType);
            case FEET_TO_INCH:
                return super.getMeasurementValue(unitValue, feetToInch, measurementType);
            case INCH_TO_FEET:
                return super.getMeasurementValue(unitValue, inchToFeet, measurementType);
            case FEET_TO_YARD:
                return super.getMeasurementValue(unitValue, feetToYard, measurementType);
            case YARD_TO_FEET:
                return super.getMeasurementValue(unitValue, yardToFeet, measurementType);
            case INCH_TO_CM:
                return super.getMeasurementValue(unitValue, inchToCentimeter, measurementType);
            case CM_TO_INCH:
                return super.getMeasurementValue(unitValue, centimeterToInch, measurementType);
            case INCH_TO_YARD:
                return super.getMeasurementValue(unitValue, inchToYard, measurementType);
            case YARD_TO_INCH:
                return super.getMeasurementValue(unitValue, yardToInch, measurementType);
        }
        return 0;
    }
}
