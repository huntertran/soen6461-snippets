package ReuseAndSubtypeCombined;

public class Size extends AbstractMeasure implements Measure {
    int getRealValue(){
        return 2;
    }
}