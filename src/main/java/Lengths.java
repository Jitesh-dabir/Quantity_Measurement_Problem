public enum Lengths {
    FEET(1 * 12.0), INCH(1 / 12.0), FEET_TO_YARD(1 / 3.0), INCH_TO_YARD(1 / 36.0), YARD_TO_INCH(1 * 36.0);

    public final double value;

    Lengths(double value) {
        this.value = value;
    }
}
