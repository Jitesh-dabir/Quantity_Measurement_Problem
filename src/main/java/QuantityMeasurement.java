import java.util.Objects;

public class QuantityMeasurement {

    private final double feet;

    public QuantityMeasurement(double feet) {
        this.feet = feet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feet, feet) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(feet);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to quantity measurement system");
    }
}