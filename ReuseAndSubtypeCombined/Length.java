package ReuseAndSubtypeCombined;

public class Length extends AbstractMeasure implements Measure {
    int getRealValue() {
        return 1;
    }
}