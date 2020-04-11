public enum Lengths {
    FEET(1 * 12.0), INCH_TO_FEET(1 / 12.0), FEET_TO_YARD(1 / 3.0),
    INCH_TO_YARD(1 / 36.0), YARD_TO_INCH(1 * 36.0), YARD_TO_FEET(1 * 3.0),
    INCH_TO_CM(1 * 2.54), CM_TO_INCH(1 / 2.54), INCH(1.0),
    GALLON_TO_LITRES(1 * 3.78), LITRES_TO_GALLON(1 / 3.78),
    LITER_TO_MILLILITER(1 * 1000.0), MILLILITER_TO_LITER(1 / 1000.0),
    KG_TO_GRAMS(1 * 1000.0), TONNE_TO_KG(1 * 1000.0), GRAM_TO_KG(1 / 1000.0),
    KG_TO_TONNE(1 / 1000.0);
    public final double value;

    Lengths(double value) {
        this.value = value;
    }
}
