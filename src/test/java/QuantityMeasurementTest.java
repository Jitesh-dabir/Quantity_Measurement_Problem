import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0feet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement firstFeet = new QuantityMeasurement(0.0);
        QuantityMeasurement secondFeet = new QuantityMeasurement(0.0);
        boolean result = firstFeet.equals(secondFeet);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given0FeetAnd0feet_WhenNullCheck_ShouldReturnResult() {
        QuantityMeasurement firstFeet = new QuantityMeasurement(0.0);
        QuantityMeasurement secondFeet = new QuantityMeasurement(0.0);
        boolean result = firstFeet.equals(null);
        Assert.assertEquals(false, result);
    }
}