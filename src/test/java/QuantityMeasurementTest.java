import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0feet_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, secondUnit);
        double firstFeet = firstQuantityMeasurement.getMeasurementValue();
        double secondFeet = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void given0FeetAnd0feet_WhenNullCheck_ShouldReturnResult() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        boolean equal = quantityMeasurement.equals(null);
        Assert.assertEquals(false, equal);
    }

    @Test
    public void given0FeetAnd0feet_WhenCheckReference_ShouldReturnTrue() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given0FeetAnd0feet_WhenType_ShouldReturnTrue() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, secondUnit);
        boolean result = firstQuantityMeasurement.equals(secondQuantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given0FeetAnd3feet_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double firstUnit = 0.0, secondUnit = 3.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, secondUnit);
        double firstFeet = firstQuantityMeasurement.getMeasurementValue();
        double secondFeet = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertNotEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void givenSameValueToNBothFeet_WhenBothEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double firstUnit = 50.0, secondUnit = 50.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, secondUnit);
        double firstFeet = firstQuantityMeasurement.getMeasurementValue();
        double secondFeet = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, secondUnit);
        double firstInch = firstQuantityMeasurement.getMeasurementValue();
        double secondInch = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenNullCheck_ShouldReturnFalse() {
        double firstUnit = 0.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH, firstUnit);
        boolean equal = quantityMeasurement.equals(null);
        Assert.assertEquals(false, equal);
    }

    @Test
    public void given0InchAnd0Inch_WhenCheckReference_ShouldReturnTrue() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH, firstUnit);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given0InchAnd0Inch_WhenCheckType_ShouldReturnTrue() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, secondUnit);
        boolean result = firstQuantityMeasurement.equals(secondQuantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given3InchAnd4Inch_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double firstUnit = 0.0, secondUnit = 3.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, secondUnit);
        double firstInch = firstQuantityMeasurement.getMeasurementValue();
        double secondInch = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertNotEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void givenSameValueToNBothInch_WhenBothEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double firstUnit = 600.0, secondUnit = 600.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, firstUnit);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.INCH, secondUnit);
        double firstInch = firstQuantityMeasurement.getMeasurementValue();
        double secondInch = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void given0FeetAnd0Inch_WhenCheckComparison_ShouldReturnTrue() throws QuantityMeasurementException {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        double firstFeet = firstQuantityMeasurement.getMeasurementValue();
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.INCH_TO_FEET, secondUnit);
        double secondInch = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double firstUnit = 1.0, secondUnit = 1.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, firstUnit);
        double firstFeet = firstQuantityMeasurement.getMeasurementValue();
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.INCH_TO_FEET, secondUnit);
        double secondInch = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertNotEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double firstUnit = 1.0, secondUnit = 1.0;
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.INCH_TO_FEET, firstUnit);
        double firstInch = firstQuantityMeasurement.getMeasurementValue();
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.FEET, secondUnit);
        double secondFeet = secondQuantityMeasurement.getMeasurementValue();
        Assert.assertNotEquals(firstInch, secondFeet, 0.0);
    }

    @Test
    public void given1Feet_WhenCheckComparisonEqualTo12Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitFeet = 1.0, unitInch = 12.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET, unitFeet);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertEquals(unitInch, firstFeet, 0.0);
    }

    @Test
    public void given12Inch_WhenCheckComparisonEqualTo1Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitFeet = 1.0, unitInch = 12.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH_TO_FEET, unitInch);
        double firstFeet = quantityMeasurementInch.getMeasurementValue();
        Assert.assertEquals(unitFeet, firstFeet, 0.0);
    }

    @Test
    public void given3Feet_WhenCheckComparisonEqualTo1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitFeet = 3.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET_TO_YARD, unitFeet);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertEquals(unitYard, firstFeet, 0.0);
    }

    @Test
    public void given1Feet_WhenCheckComparisonNotEqualTo1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitFeet = 1.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET_TO_YARD, unitFeet);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertNotEquals(unitYard, firstFeet, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckComparisonNotEqualTo1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitInch = 1.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_YARD, unitInch);
        double inch = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertNotEquals(unitYard, inch, 0.0);
    }

    @Test
    public void given1Yard_WhenCheckComparisonEqualTo36Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitInch = 36.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.YARD_TO_INCH, unitYard);
        double yard = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertEquals(unitInch, yard, 0.0);
    }

    @Test
    public void given36Inch_WhenCheckComparisonEqualTo1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitInch = 36.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_YARD, unitInch);
        double inch = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertEquals(unitYard, inch, 0.0);
    }

    @Test
    public void given1Yard_WhenCheckComparisonEqualTo3Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitFeet = 3.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.YARD_TO_FEET, unitYard);
        double yard = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertEquals(unitFeet, yard, 0.0);
    }

    @Test
    public void given2Inch_WhenCheckComparisonEqualTo5Cm_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitInch = 2.0, unitCm = 5.08;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_CM, unitInch);
        double inch = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertEquals(unitCm, inch, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckComparisonNotEqualTo1Cm_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitInch = 1.0, unitCm = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_CM, unitInch);
        double inch = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertNotEquals(unitCm, inch, 0.0);
    }

    @Test
    public void given5Cm_WhenCheckComparisonEqualTo2Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        double unitInch = 2.0, unitCm = 5.09;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.CM_TO_INCH, unitCm);
        double centimeter = quantityMeasurementFeet.getMeasurementValue();
        Assert.assertEquals((int) unitInch, (int) centimeter, 0.0);
    }

    @Test
    public void givenFeetAndInch_WhenAdditionOfTwoLength_ShouldReturnResult() throws QuantityMeasurementException {
        double unitFeet = 1.0, unitInch = 2.0, expectedUnit = 14;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.FEET, unitFeet);
        double inch = quantityMeasurementInch.getMeasurementValue();
        QuantityMeasurement quantityMeasurementInch1 = new QuantityMeasurement(Lengths.INCH, unitInch);
        double feet = quantityMeasurementInch1.getMeasurementValue();
        double additionOfUnit = inch + feet;
        Assert.assertEquals(expectedUnit, additionOfUnit, 0.0);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdditionOfTwoLength_ShouldReturn4Result() throws QuantityMeasurementException {
        double unitInInch = 2.0, unitInch = 2.0, expectedUnit = 4.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH, unitInInch);
        double inch = quantityMeasurementInch.getMeasurementValue();
        QuantityMeasurement quantityMeasurementInch1 = new QuantityMeasurement(Lengths.INCH, unitInch);
        double feet = quantityMeasurementInch1.getMeasurementValue();
        double additionOfUnit = inch + feet;
        Assert.assertEquals(expectedUnit, additionOfUnit, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdditionOfTwoLength_ShouldReturnResultInInches() throws QuantityMeasurementException {
        double unitInFeet = 1.0, unitFeet = 1.0, expectedUnit = 24.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.FEET, unitInFeet);
        double feetValue = quantityMeasurementInch.getMeasurementValue();
        QuantityMeasurement quantityMeasurementInch1 = new QuantityMeasurement(Lengths.FEET, unitFeet);
        double feetvalue = quantityMeasurementInch1.getMeasurementValue();
        double additionOfUnit = feetValue + feetvalue;
        Assert.assertEquals(expectedUnit, additionOfUnit, 0.0);
    }

    @Test
    public void given2InchAnd2Cm_WhenAdditionOfTwoLength_ShouldReturnResultInInches() throws QuantityMeasurementException {
        double unitInInch = 2.3, unitInCm = 2.5, expectedUnit = 3.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH, unitInInch);
        double inch = quantityMeasurementInch.getMeasurementValue();
        QuantityMeasurement quantityMeasurementCm = new QuantityMeasurement(Lengths.CM_TO_INCH, unitInCm);
        double centimeter = quantityMeasurementCm.getMeasurementValue();
        double additionOfUnit = inch + centimeter;
        Assert.assertEquals((int) expectedUnit, (int) additionOfUnit, 0.0);
    }

    @Test
    public void givenGallon_WhenCheckComparisonToGallon_ShouldReturnResultTrue() throws QuantityMeasurementException {
        double unitInGallon = 0.0, unitGallon = 0.0;
        QuantityMeasurement quantityMeasurementGallon = new QuantityMeasurement(Lengths.GALLON_TO_LITRES, unitInGallon);
        double gallon = quantityMeasurementGallon.getMeasurementValue();
        QuantityMeasurement quantityMeasurementInGallon = new QuantityMeasurement(Lengths.GALLON_TO_LITRES, unitGallon);
        double gallonValue = quantityMeasurementInGallon.getMeasurementValue();
        Assert.assertEquals(gallon, gallonValue, 0.0);
    }

    @Test
    public void givenGallon_WhenCheckComparisonToLitre_ShouldReturnResultTrue() throws QuantityMeasurementException {
        double unitInGallon = 1.0, expectedUnitInLitre = 3.78;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.GALLON_TO_LITRES, unitInGallon);
        double literValue = quantityMeasurementInLitre.getMeasurementValue();
        Assert.assertEquals(expectedUnitInLitre, literValue, 0.0);
    }

    @Test
    public void givenLiter_WhenCheckComparisonToGallon_ShouldReturnResultTrue() throws QuantityMeasurementException {
        double unitInLiter = 3.78, expectedUnitInGallon = 1.0;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.LITRES_TO_GALLON, unitInLiter);
        double gallonValue = quantityMeasurementInLitre.getMeasurementValue();
        Assert.assertEquals(expectedUnitInGallon, gallonValue, 0.0);
    }

    @Test
    public void givenLiter_WhenCheckComparisonToMilliliter_ShouldReturnResultTrue() throws QuantityMeasurementException {
        double unitInLitre = 1.0, unitInMilliliter = 1000.0;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.LITER_TO_MILLILITER, unitInLitre);
        double milliliterValue = quantityMeasurementInLitre.getMeasurementValue();
        Assert.assertEquals(unitInMilliliter, milliliterValue, 0.0);
    }

    @Test
    public void givenMilliliter_WhenCheckComparisonToLiter_ShouldReturnResultTrue() throws QuantityMeasurementException {
        double unitInMillilitre = 1000.0, unitInLiter = 1.0;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.MILLILITER_TO_LITER, unitInMillilitre);
        double literValue = quantityMeasurementInLitre.getMeasurementValue();
        Assert.assertEquals(unitInLiter, literValue, 0.0);
    }

    @Test
    public void givenGallonAndLiters_WhenAdditionOfTwoVolumes_ShouldReturnResultInLiters() throws QuantityMeasurementException {
        double unitInGallon = 1.0, unitInLiter = 3.78, expectedInLiters = 7.56;
        QuantityMeasurement quantityMeasurementLitre = new QuantityMeasurement(Lengths.GALLON_TO_LITRES, unitInGallon);
        double literValue = quantityMeasurementLitre.getMeasurementValue();
        double resultInLiters = literValue + unitInLiter;
        Assert.assertEquals(expectedInLiters, resultInLiters, 0.0);
    }

    @Test
    public void givenMilliliterAndLiters_WhenAdditionOfTwoVolumes_ShouldReturnResultInLiters() throws QuantityMeasurementException {
        double unitInMilliliter = 1000.0, unitInLiter = 1.0, expectedInLiters = 2.0;
        QuantityMeasurement quantityMeasurementLitre = new QuantityMeasurement(Lengths.MILLILITER_TO_LITER, unitInMilliliter);
        double literValue = quantityMeasurementLitre.getMeasurementValue();
        double resultInLiters = literValue + unitInLiter;
        Assert.assertEquals(expectedInLiters, resultInLiters, 0.0);
    }

    @Test
    public void givenKg_WhenCheckComparisonToGrams_ShouldReturnResult() throws QuantityMeasurementException {
        double unitInKilogram = 1.0, unitInGrams = 1000.0;
        QuantityMeasurement quantityMeasurementInKg = new QuantityMeasurement(Lengths.KG_TO_GRAMS, unitInKilogram);
        double gramValue = quantityMeasurementInKg.getMeasurementValue();
        Assert.assertEquals(unitInGrams, gramValue, 0.0);
    }

    @Test
    public void givenTonne_WhenCheckComparisonToKilograms_ShouldReturnResult() throws QuantityMeasurementException {
        double unitInKilogram = 1000.0, unitInTonne = 1.0;
        QuantityMeasurement quantityMeasurementInTonne = new QuantityMeasurement(Lengths.TONNE_TO_KG, unitInTonne);
        double kilogramValue = quantityMeasurementInTonne.getMeasurementValue();
        Assert.assertEquals(unitInKilogram, kilogramValue, 0.0);
    }

    @Test
    public void givenGrams_WhenCheckComparisonToKilogram_ShouldReturnResult() throws QuantityMeasurementException {
        double unitInKilogram = 1.0, unitInGrams = 1000.0;
        QuantityMeasurement quantityMeasurementInKg = new QuantityMeasurement(Lengths.GRAM_TO_KG, unitInGrams);
        double gramValue = quantityMeasurementInKg.getMeasurementValue();
        Assert.assertEquals(unitInKilogram, gramValue, 0.0);
    }

    @Test
    public void givenKg_WhenCheckComparisonToTonne_ShouldReturnResult() throws QuantityMeasurementException {
        double unitInKilogram = 1000.0, unitInTonne = 1.0;
        QuantityMeasurement quantityMeasurementInTonne = new QuantityMeasurement(Lengths.KG_TO_TONNE, unitInKilogram);
        double kilogramValue = quantityMeasurementInTonne.getMeasurementValue();
        Assert.assertEquals(unitInTonne, kilogramValue, 0.0);
    }

    @Test
    public void givenTonneAndGram_WhenAdditionOfTonneAndGram_ShouldReturnResultInKg() throws QuantityMeasurementException {
        double unitInGram = 1000.0, unitInTonne = 1.0, expectedUnitInKg = 1001.0;
        QuantityMeasurement quantityMeasurementInTonne = new QuantityMeasurement(Lengths.TONNE_TO_KG, unitInTonne);
        double tonneValue = quantityMeasurementInTonne.getMeasurementValue();
        QuantityMeasurement quantityMeasurementIngram = new QuantityMeasurement(Lengths.GRAM_TO_KG, unitInGram);
        double gramValue = quantityMeasurementIngram.getMeasurementValue();
        double additionResult = tonneValue + gramValue;
        Assert.assertEquals(expectedUnitInKg, additionResult, 0.0);
    }

    @Test
    public void givenFahrenheit_WhenCheckComparisonToCelsius_ShouldReturnResult() throws QuantityMeasurementException {
        double unitInFahrenheit = 212, unitInCelsius = 100;
        QuantityMeasurement quantityMeasurementInFahrenheit = new QuantityMeasurement(Lengths.FAHRENHEIT_TO_CELSIUS, unitInFahrenheit);
        double celsiusValue = quantityMeasurementInFahrenheit.getMeasurementValue();
        Assert.assertEquals(unitInCelsius, celsiusValue, 0.0);
    }

    @Test
    public void givenCelsius_WhenCheckComparisonToFahrenheit_ShouldReturnResult() throws QuantityMeasurementException {
        double unitInFahrenheit = 212, unitInCelsius = 100;
        QuantityMeasurement quantityMeasurementInFahrenheit = new QuantityMeasurement(Lengths.CELSIUS_TO_FAHRENHEIT, unitInCelsius);
        double celsiusValue = quantityMeasurementInFahrenheit.getMeasurementValue();
        Assert.assertEquals(unitInFahrenheit, celsiusValue, 0.0);
    }

    @Test
    public void givenNullMeasurementType_WhenCheckComparisonToFahrenheit_ShouldThroughException() throws QuantityMeasurementException {
        try {
            double unitInFahrenheit = 212, unitInCelsius = 100;
            QuantityMeasurement quantityMeasurementInFahrenheit = new QuantityMeasurement(null, unitInCelsius);
            double celsiusValue = quantityMeasurementInFahrenheit.getMeasurementValue();
            Assert.assertEquals(unitInFahrenheit, celsiusValue, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.MyException.NULL_VALUE, e.type);
        }

    }
}