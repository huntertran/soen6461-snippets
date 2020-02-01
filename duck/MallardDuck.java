package duck;

import duck.flyable.FlyWithWings;
import duck.quackable.Quack;

public class MallardDuck extends ReuseCodeForDuck implements IDuck {

    public MallardDuck() {
        super("Mallard duck");
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
}