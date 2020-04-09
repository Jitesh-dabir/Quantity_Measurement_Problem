import java.util.Objects;

public class QuantityMeasurement {

    private final double feet;

    public QuantityMeasurement(double feet) {
        this.feet = feet;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        if (object == this)
            return true;
        if (object.getClass() == this.getClass())
            return true;
        return super.equals(object);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to quantity measurement system");
    }
}