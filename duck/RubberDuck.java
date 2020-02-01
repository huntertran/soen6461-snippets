package duck;

import duck.flyable.NoFly;
import duck.quackable.Squeak;

public class RubberDuck extends ReuseCodeForDuck implements IDuck {

    public RubberDuck() {
        super("Rubber duck");
        setQuackBehavior(new Squeak());
        setFlyBehavior(new NoFly());
    }
}