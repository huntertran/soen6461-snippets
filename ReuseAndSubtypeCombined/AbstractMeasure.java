public abstract class AbstractMeasure {
    public int getValue() {
        System.out.println("Before...");
        return this.getRealValue();
    }

    abstract int getRealValue();
}