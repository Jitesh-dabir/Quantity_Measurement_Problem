public enum MeasurementUnits {
    FEET(MeasurementUnitTypes.LENGTH), FEET_TO_INCH(MeasurementUnitTypes.LENGTH),
    INCH(MeasurementUnitTypes.LENGTH), INCH_TO_FEET(MeasurementUnitTypes.LENGTH),
    FEET_TO_YARD(MeasurementUnitTypes.LENGTH), YARD_TO_FEET(MeasurementUnitTypes.LENGTH),
    YARD(MeasurementUnitTypes.LENGTH), INCH_TO_YARD(MeasurementUnitTypes.LENGTH),
    YARD_TO_INCH(MeasurementUnitTypes.LENGTH), INCH_TO_CM(MeasurementUnitTypes.LENGTH),
    CM_TO_INCH(MeasurementUnitTypes.LENGTH),

    GALLON_TO_LITRES(MeasurementUnitTypes.VOLUME), LITRES_TO_GALLON(MeasurementUnitTypes.VOLUME),
    GALLON(MeasurementUnitTypes.VOLUME), LITER_TO_MILLILITER(MeasurementUnitTypes.VOLUME),
    MILLILITER_TO_LITER(MeasurementUnitTypes.VOLUME), LITER(MeasurementUnitTypes.VOLUME),

    KG_TO_GRAMS(MeasurementUnitTypes.WEIGHT), TONNE_TO_KG(MeasurementUnitTypes.WEIGHT),
    GRAM_TO_KG(MeasurementUnitTypes.WEIGHT), KG_TO_TONNE(MeasurementUnitTypes.WEIGHT),

    FAHRENHEIT_TO_CELSIUS(MeasurementUnitTypes.TEMPERATURE),
    CELSIUS_TO_FAHRENHEIT(MeasurementUnitTypes.TEMPERATURE);

    private final MeasurementUnitTypes type;

    MeasurementUnits(MeasurementUnitTypes type) {
        this.type = type;
    }

    public MeasurementUnitTypes getType() {
        return type;
    }
}
