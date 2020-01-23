package ReuseAndSubtypeCombined;

public abstract class AbstractMeasure {
    public final int getValue() {
        System.out.println("Before...");
        return this.getRealValue();
    }

    abstract int getRealValue();
}