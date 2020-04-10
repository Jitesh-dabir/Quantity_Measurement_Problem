import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0feet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurement.getMeasurementValue(0.0);
        double secondFeet = quantityMeasurement.getMeasurementValue(0.0);
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
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurement.getMeasurementValue(0.0);
        double secondFeet = quantityMeasurement.getMeasurementValue(3.0);
        Assert.assertNotEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void givenSameValueToNBothFeet_WhenBothEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurement.getMeasurementValue(50);
        double secondFeet = quantityMeasurement.getMeasurementValue(50);
        Assert.assertEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstInch = quantityMeasurement.getMeasurementValue(0.0);
        double secondInch = quantityMeasurement.getMeasurementValue(0.0);
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
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstInch = quantityMeasurement.getMeasurementValue(0.0);
        double secondInch = quantityMeasurement.getMeasurementValue(3.0);
        Assert.assertNotEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void givenSameValueToNBothInch_WhenBothEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstInch = quantityMeasurement.getMeasurementValue(600.0);
        double secondInch = quantityMeasurement.getMeasurementValue(600.0);
        Assert.assertEquals(firstInch, secondInch, 0.0);
    }

    @Test
    public void given0FeetAnd0Inch_WhenCheckComparison_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(0.0);
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH);
        double secondInch = quantityMeasurementInch.getMeasurementValue(0.0);
        Assert.assertEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(1.0);
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.INCH);
        double secondInch = quantityMeasurementInch.getMeasurementValue(1.0);
        Assert.assertNotEquals(firstFeet, secondInch, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_WhenCheckComparisonAndNotEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.INCH);
        double firstInch = quantityMeasurementFeet.getMeasurementValue(1.0);
        QuantityMeasurement quantityMeasurementInch = new QuantityMeasurement(Lengths.FEET);
        double secondFeet = quantityMeasurementInch.getMeasurementValue(1.0);
        Assert.assertNotEquals(firstInch, secondFeet, 0.0);
    }

    @Test
    public void given1Feet_WhenCheckComparisonEqualTo12Inch_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(1.0);
        Assert.assertEquals(12, firstFeet, 0.0);
    }

    @Test
    public void given12Inch_WhenCheckComparisonEqualTo1Feet_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(1.0);
        Assert.assertEquals(12, firstFeet, 0.0);
    }

    @Test
    public void given3Feet_WhenCheckComparisonEqualTo1Yard_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET_TO_YARD);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(3.0);
        Assert.assertEquals(1, firstFeet, 0.0);
    }

    @Test
    public void given1Feet_WhenCheckComparisonNotEqualTo1Yard_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(Lengths.FEET_TO_YARD);
        double firstFeet = quantityMeasurementFeet.getMeasurementValue(1.0);
        Assert.assertNotEquals(1, firstFeet, 0.0);
    }
}