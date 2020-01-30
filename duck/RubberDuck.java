package duck;

import duck.flyable.IFlyBehavior;
import duck.flyable.NoFly;
import duck.quackable.IQuackBehavior;
import duck.quackable.Squeak;

public class RubberDuck extends ReuseCodeForDuck implements IDuck {

    public RubberDuck() {
        super("Rubber duck");
    }

    @Override
    public IQuackBehavior performQuack(){
        return new Squeak();
    }

    @Override
    public IFlyBehavior performFly(){
        return new NoFly();
    }
}