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
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH);
        double secondInch = quantityMeasurementInch.getMeasurementValue(secondUnit);
        Assert.assertEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() {
        double firstUnit = 1.0, secondUnit = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(firstUnit);
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH);
        double secondInch = quantityMeasurementInch.getMeasurementValue(secondUnit);
        Assert.assertNotEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() {
        double firstUnit = 1.0, secondUnit = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH);
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
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH);
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
        double yard = quantityMeasurementFeet.getMeasurementValue(unitInch);
        Assert.assertEquals(unitCm, yard, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckComparisonNotEqualTo1Cm_ShouldReturnTrue() {
        double unitInch = 1.0, unitCm = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH_TO_CM);
        double yard = quantityMeasurementFeet.getMeasurementValue(unitInch);
        Assert.assertNotEquals(unitCm, yard, 0.0);
    }
}