public enum Lengths {
    FEET(1 * 12.0), INCH(1 / 12.0);

    public final double value;

    Lengths(double value) {
        this.value = value;
    }
}
