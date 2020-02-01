package duck;

import duck.flyable.FlyWithWings;
import duck.quackable.Quack;

public class RedHeadDuck extends ReuseCodeForDuck implements IDuck {

    public RedHeadDuck() {
        super("Red Head duck");
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
}