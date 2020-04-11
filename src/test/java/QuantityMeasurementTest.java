import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0feet_WhenEqual_ShouldReturnTrue() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurement.getMeasurementValue(firstUnit);
        double secondFeet = quantityMeasurement.getMeasurementValue(secondUnit);
        Assert.assertEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void given0FeetAnd0feet_WhenNullCheck_ShouldReturnResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        boolean equal = quantityMeasurement.equals(null);
        Assert.assertEquals(false, equal);
    }

    @Test
    public void given0FeetAnd0feet_WhenCheckReference_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given0FeetAnd0feet_WhenType_ShouldReturnTrue() {
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        boolean result = firstQuantityMeasurement.equals(secondQuantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given0FeetAnd3feet_WhenNotEqual_ShouldReturnFalse() {
        double firstUnit = 0.0, secondUnit = 3.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurement.getMeasurementValue(firstUnit);
        double secondFeet = quantityMeasurement.getMeasurementValue(secondUnit);
        Assert.assertNotEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void givenSameValueToNBothFeet_WhenBothEqual_ShouldReturnTrue() {
        double firstUnit = 50.0, secondUnit = 50.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurement.getMeasurementValue(firstUnit);
        double secondFeet = quantityMeasurement.getMeasurementValue(secondUnit);
        Assert.assertEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenEqual_ShouldReturnTrue() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstInch = quantityMeasurement.getMeasurementValue(firstUnit);
        double secondInch = quantityMeasurement.getMeasurementValue(secondUnit);
        Assert.assertEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenNullCheck_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        boolean equal = quantityMeasurement.equals(null);
        Assert.assertEquals(false, equal);
    }

    @Test
    public void given0InchAnd0Inch_WhenCheckReference_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given0InchAnd0Inch_WhenCheckType_ShouldReturnTrue() {
        QuantityMeasurement firstQuantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        QuantityMeasurement secondQuantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        boolean result = firstQuantityMeasurement.equals(secondQuantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given3InchAnd4Inch_WhenNotEqual_ShouldReturnFalse() {
        double firstUnit = 0.0, secondUnit = 3.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstInch = quantityMeasurement.getMeasurementValue(firstUnit);
        double secondInch = quantityMeasurement.getMeasurementValue(secondUnit);
        Assert.assertNotEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void givenSameValueToNBothInch_WhenBothEqual_ShouldReturnTrue() {
        double firstUnit = 600.0, secondUnit = 600.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstInch = quantityMeasurement.getMeasurementValue(firstUnit);
        double secondInch = quantityMeasurement.getMeasurementValue(secondUnit);
        Assert.assertEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void given0FeetAnd0Inch_WhenCheckComparison_ShouldReturnTrue() {
        double firstUnit = 0.0, secondUnit = 0.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(firstUnit);
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH_TO_FEET);
        double secondInch = quantityMeasurementInch.getMeasurementValue(secondUnit);
        Assert.assertEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() {
        double firstUnit = 1.0, secondUnit = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(firstUnit);
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH_TO_FEET);
        double secondInch = quantityMeasurementInch.getMeasurementValue(secondUnit);
        Assert.assertNotEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() {
        double firstUnit = 1.0, secondUnit = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_FEET);
        double firstInch = quantityMeasurementFeet.getMeasurementValue(firstUnit);
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.FEET);
        double secondFeet = quantityMeasurementInch.getMeasurementValue(secondUnit);
        Assert.assertNotEquals(firstInch, secondFeet, 0.0);
    }

    @Test
    public void given1Feet_WhenCheckComparisonEqualTo12Inch_ShouldReturnTrue() {
        double unitFeet = 1.0, unitInch = 12.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(unitFeet);
        Assert.assertEquals(unitInch, firstFeet, 0.0);
    }

    @Test
    public void given12Inch_WhenCheckComparisonEqualTo1Feet_ShouldReturnTrue() {
        double unitFeet = 1.0, unitInch = 12.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH_TO_FEET);
        double firstFeet = quantityMeasurementInch.getMeasurementValue(unitInch);
        Assert.assertEquals(unitFeet, firstFeet, 0.0);
    }

    @Test
    public void given3Feet_WhenCheckComparisonEqualTo1Yard_ShouldReturnTrue() {
        double unitFeet = 3.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET_TO_YARD);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(unitFeet);
        Assert.assertEquals(unitYard, firstFeet, 0.0);
    }

    @Test
    public void given1Feet_WhenCheckComparisonNotEqualTo1Yard_ShouldReturnTrue() {
        double unitFeet = 1.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET_TO_YARD);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(unitFeet);
        Assert.assertNotEquals(unitYard, firstFeet, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckComparisonNotEqualTo1Yard_ShouldReturnTrue() {
        double unitInch = 1.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_YARD);
        double inch = quantityMeasurementFeet.getMeasurementValue(unitInch);
        Assert.assertNotEquals(unitYard, inch, 0.0);
    }

    @Test
    public void given1Yard_WhenCheckComparisonEqualTo36Inch_ShouldReturnTrue() {
        double unitInch = 36.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.YARD_TO_INCH);
        double yard = quantityMeasurementFeet.getMeasurementValue(unitYard);
        Assert.assertEquals(unitInch, yard, 0.0);
    }

    @Test
    public void given36Inch_WhenCheckComparisonEqualTo1Yard_ShouldReturnTrue() {
        double unitInch = 36.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_YARD);
        double inch = quantityMeasurementFeet.getMeasurementValue(unitInch);
        Assert.assertEquals(unitYard, inch, 0.0);
    }

    @Test
    public void given1Yard_WhenCheckComparisonEqualTo3Feet_ShouldReturnTrue() {
        double unitFeet = 3.0, unitYard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.YARD_TO_FEET);
        double yard = quantityMeasurementFeet.getMeasurementValue(unitYard);
        Assert.assertEquals(unitFeet, yard, 0.0);
    }

    @Test
    public void given2Inch_WhenCheckComparisonEqualTo5Cm_ShouldReturnTrue() {
        double unitInch = 2.0, unitCm = 5.08;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_CM);
        double inch = quantityMeasurementFeet.getMeasurementValue(unitInch);
        Assert.assertEquals(unitCm, inch, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckComparisonNotEqualTo1Cm_ShouldReturnTrue() {
        double unitInch = 1.0, unitCm = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_CM);
        double inch = quantityMeasurementFeet.getMeasurementValue(unitInch);
        Assert.assertNotEquals(unitCm, inch, 0.0);
    }

    @Test
    public void given5Cm_WhenCheckComparisonEqualTo2Inch_ShouldReturnTrue() {
        double unitInch = 2.0, unitCm = 5.09;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.CM_TO_INCH);
        double centimter = quantityMeasurementFeet.getMeasurementValue(unitCm);
        Assert.assertEquals((int) unitInch, (int) centimter, 0.0);
    }

    @Test
    public void givenFeetAndInch_WhenAdditionOfTwoLength_ShouldReturnResult() {
        double unitFeet = 1.0, unitInch = 2.0, expectedUnit = 14;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.FEET);
        double inch = quantityMeasurementInch.getMeasurementValue(unitFeet);
        QuantityMeasurement quantityMeasurementInch1 = new QuantityMeasurement(Lengths.INCH);
        double feet = quantityMeasurementInch1.getMeasurementValue(unitInch);
        double additionOfUnit = inch + feet;
        Assert.assertEquals(expectedUnit, additionOfUnit, 0.0);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdditionOfTwoLength_ShouldReturn4Result() {
        double unitInInch = 2.0, unitInch = 2.0, expectedUnit = 4.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH);
        double inch = quantityMeasurementInch.getMeasurementValue(unitInInch);
        QuantityMeasurement quantityMeasurementInch1 = new QuantityMeasurement(Lengths.INCH);
        double feet = quantityMeasurementInch1.getMeasurementValue(unitInch);
        double additionOfUnit = inch + feet;
        Assert.assertEquals(expectedUnit, additionOfUnit, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdditionOfTwoLength_ShouldReturnResultInInches() {
        double unitInInch = 1.0, unitInch = 1.0, expectedUnit = 24.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.FEET);
        double inch = quantityMeasurementInch.getMeasurementValue(unitInInch);
        QuantityMeasurement quantityMeasurementInch1 = new QuantityMeasurement(Lengths.FEET);
        double inch1 = quantityMeasurementInch1.getMeasurementValue(unitInch);
        double additionOfUnit = inch + inch1;
        Assert.assertEquals(expectedUnit, additionOfUnit, 0.0);
    }

    @Test
    public void given2InchAnd2Cm_WhenAdditionOfTwoLength_ShouldReturnResultInInches() {
        double unitInInch = 2.3, unitInCm = 2.5, expectedUnit = 3.0;
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH);
        double inch = quantityMeasurementInch.getMeasurementValue(unitInInch);
        QuantityMeasurement quantityMeasurementInch1 = new QuantityMeasurement(Lengths.CM_TO_INCH);
        double inch1 = quantityMeasurementInch1.getMeasurementValue(unitInCm);
        double additionOfUnit = inch + inch1;
        Assert.assertEquals((int) expectedUnit, (int) additionOfUnit, 0.0);
    }

    @Test
    public void givenGallon_WhenCheckComparisonToGallon_ShouldReturnResultTrue() {
        double unitInGallon = 0.0, unitGallon = 0.0;
        QuantityMeasurement quantityMeasurementGallon = new QuantityMeasurement(Lengths.GALLON_TO_LITRES);
        double gallon = quantityMeasurementGallon.getMeasurementValue(unitInGallon);
        QuantityMeasurement quantityMeasurementInGallon = new QuantityMeasurement(Lengths.GALLON_TO_LITRES);
        double gallonValue = quantityMeasurementInGallon.getMeasurementValue(unitGallon);
        Assert.assertEquals(gallon, gallonValue, 0.0);
    }

    @Test
    public void givenGallon_WhenCheckComparisonToLitre_ShouldReturnResultTrue() {
        double unitInGallon = 1.0, expectedUnitInLitre = 3.78;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.GALLON_TO_LITRES);
        double literValue = quantityMeasurementInLitre.getMeasurementValue(unitInGallon);
        Assert.assertEquals(expectedUnitInLitre, literValue, 0.0);
    }

    @Test
    public void givenLiter_WhenCheckComparisonToGallon_ShouldReturnResultTrue() {
        double unitInLiter = 3.78, expectedUnitInGallon = 1.0;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.LITRES_TO_GALLON);
        double gallonValue = quantityMeasurementInLitre.getMeasurementValue(unitInLiter);
        Assert.assertEquals(expectedUnitInGallon, gallonValue, 0.0);
    }

    @Test
    public void givenLiter_WhenCheckComparisonToMilliliter_ShouldReturnResultTrue() {
        double unitInLitre = 1.0, unitInMilliliter = 1000.0;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.LITER_TO_MILLILITER);
        double milliliterValue = quantityMeasurementInLitre.getMeasurementValue(unitInLitre);
        Assert.assertEquals(unitInMilliliter, milliliterValue, 0.0);
    }

    @Test
    public void givenMilliliter_WhenCheckComparisonToLiter_ShouldReturnResultTrue() {
        double unitInMillilitre = 1000.0, unitInLiter = 1.0;
        QuantityMeasurement quantityMeasurementInLitre = new QuantityMeasurement(Lengths.MILLILITER_TO_LITER);
        double literValue = quantityMeasurementInLitre.getMeasurementValue(unitInMillilitre);
        Assert.assertEquals(unitInLiter, literValue, 0.0);
    }

    @Test
    public void givenGallonAndLiters_WhenAdditionOfTwoVolumes_ShouldReturnResultInLiters() {
        double unitInGallon = 1.0, unitInLiter = 3.78, expectedInLiters = 7.56;
        QuantityMeasurement quantityMeasurementLitre = new QuantityMeasurement(Lengths.GALLON_TO_LITRES);
        double literValue = quantityMeasurementLitre.getMeasurementValue(unitInGallon);
        double resultInLiters = literValue + unitInLiter;
        Assert.assertEquals(expectedInLiters, resultInLiters, 0.0);
    }

    @Test
    public void givenMilliliterAndLiters_WhenAdditionOfTwoVolumes_ShouldReturnResultInLiters() {
        double unitInMilliliter = 1000.0, unitInLiter = 1.0, expectedInLiters = 2.0;
        QuantityMeasurement quantityMeasurementLitre = new QuantityMeasurement(Lengths.MILLILITER_TO_LITER);
        double literValue = quantityMeasurementLitre.getMeasurementValue(unitInMilliliter);
        double resultInLiters = literValue + unitInLiter;
        Assert.assertEquals(expectedInLiters, resultInLiters, 0.0);
    }

    @Test
    public void givenKg_WhenCheckComparisonToGrams_ShouldReturnResult() {
        double unitInKilogram = 1.0, unitInGrams = 1000.0;
        QuantityMeasurement quantityMeasurementInKg = new QuantityMeasurement(Lengths.KG_TO_GRAMS);
        double gramValue = quantityMeasurementInKg.getMeasurementValue(unitInKilogram);
        Assert.assertEquals(unitInGrams, gramValue, 0.0);
    }

    @Test
    public void givenTonne_WhenCheckComparisonToKilograms_ShouldReturnResult() {
        double unitInKilogram = 1000.0, unitInTonne = 1.0;
        QuantityMeasurement quantityMeasurementInTonne = new QuantityMeasurement(Lengths.TONNE_TO_KG);
        double kilogramValue = quantityMeasurementInTonne.getMeasurementValue(unitInTonne);
        Assert.assertEquals(unitInKilogram, kilogramValue, 0.0);
    }

    @Test
    public void givenGrams_WhenCheckComparisonToKilogram_ShouldReturnResult() {
        double unitInKilogram = 1.0, unitInGrams = 1000.0;
        QuantityMeasurement quantityMeasurementInKg = new QuantityMeasurement(Lengths.GRAM_TO_KG);
        double gramValue = quantityMeasurementInKg.getMeasurementValue(unitInGrams);
        Assert.assertEquals(unitInKilogram, gramValue, 0.0);
    }

    @Test
    public void givenKg_WhenCheckComparisonToTonne_ShouldReturnResult() {
        double unitInKilogram = 1000.0, unitInTonne = 1.0;
        QuantityMeasurement quantityMeasurementInTonne = new QuantityMeasurement(Lengths.KG_TO_TONNE);
        double kilogramValue = quantityMeasurementInTonne.getMeasurementValue(unitInKilogram);
        Assert.assertEquals(unitInTonne, kilogramValue, 0.0);
    }

    @Test
    public void givenTonneAndGram_WhenAdditionOfTonneAndGram_ShouldReturnResultInKg() {
        double unitInGram = 1000.0, unitInTonne = 1.0, expectedUnitInKg = 1001.0;
        QuantityMeasurement quantityMeasurementInTonne = new QuantityMeasurement(Lengths.TONNE_TO_KG);
        double tonneValue = quantityMeasurementInTonne.getMeasurementValue(unitInTonne);
        QuantityMeasurement quantityMeasurementIngram = new QuantityMeasurement(Lengths.GRAM_TO_KG);
        double gramValue = quantityMeasurementIngram.getMeasurementValue(unitInGram);
        double additionResult= tonneValue+gramValue;
        Assert.assertEquals(expectedUnitInKg, additionResult, 0.0);
    }
}