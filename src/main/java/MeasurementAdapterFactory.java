public class MeasurementAdapterFactory {

    public static double getQuantityObject(double unit, MeasurementUnits measurementType) throws QuantityMeasurementException {
        if (measurementType == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.MyException.NULL_VALUE, "Null Measurement type");
        switch (measurementType) {
            case FEET:
            case INCH:
            case YARD:
            case FEET_TO_INCH:
            case INCH_TO_FEET:
            case FEET_TO_YARD:
            case YARD_TO_FEET:
            case INCH_TO_YARD:
            case YARD_TO_INCH:
            case INCH_TO_CM:
            case CM_TO_INCH:
                return new Length().getMeasurementValue(unit, measurementType);
            case GALLON_TO_LITRES:
            case LITRES_TO_GALLON:
            case LITER_TO_MILLILITER:
            case MILLILITER_TO_LITER:
                return new Volume().getMeasurementValue(unit, measurementType);
            case KG_TO_GRAMS:
            case GRAM_TO_KG:
            case TONNE_TO_KG:
            case KG_TO_TONNE:
                return new Weight().getMeasurementValue(unit, measurementType);
            case CELSIUS_TO_FAHRENHEIT:
            case FAHRENHEIT_TO_CELSIUS:
                return new Temperature().getMeasurementValue(unit, measurementType);
        }
        return 0;
    }
}
