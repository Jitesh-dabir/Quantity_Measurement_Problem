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
        double firstFeet = quantityMeasurement.getMeasurementValue(0.0);
        double secondFeet = quantityMeasurement.getMeasurementValue(0.0);
        boolean equal = quantityMeasurement.equals(null);
        Assert.assertEquals(false, equal);
    }

    @Test
    public void given0FeetAnd0feet_WhenReference_ShouldReturnTrue() {
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
    public void given0InchAnd0Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstFeet = quantityMeasurement.getMeasurementValue(0.0);
        double secondFeet = quantityMeasurement.getMeasurementValue(0.0);
        Assert.assertEquals(firstFeet, secondFeet, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenNullCheck_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Lengths.INCH);
        double firstFeet = quantityMeasurement.getMeasurementValue(0.0);
        double secondFeet = quantityMeasurement.getMeasurementValue(0.0);
        boolean equal = quantityMeasurement.equals(null);
        Assert.assertEquals(false, equal);
    }
}