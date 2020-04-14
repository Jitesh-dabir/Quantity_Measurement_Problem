public class Weight extends MeasurementAdapter {
    @Override
    public double getMeasurementValue(double unitValue, MeasurementUnits measurementType) throws QuantityMeasurementException {
        double kiloGramToGram = 1000.0, gramToKiloGram = 1 / 1000.0,
                kiloGramToTonne = 1 / 1000.0, tonneToKilogram = 1000.0;
        switch (measurementType) {
            case KG_TO_GRAMS:
                return super.getMeasurementValue(unitValue, kiloGramToGram, measurementType);
            case GRAM_TO_KG:
                return super.getMeasurementValue(unitValue, gramToKiloGram, measurementType);
            case KG_TO_TONNE:
                return super.getMeasurementValue(unitValue, kiloGramToTonne, measurementType);
            case TONNE_TO_KG:
                return super.getMeasurementValue(unitValue, tonneToKilogram, measurementType);
        }
        return 0;
    }
}
