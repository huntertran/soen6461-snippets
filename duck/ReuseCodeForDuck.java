package duck;

import duck.flyable.FlyWithWings;
import duck.flyable.IFlyBehavior;
import duck.quackable.IQuackBehavior;
import duck.quackable.Quack;

abstract class ReuseCodeForDuck {

    private String name;

    private IFlyBehavior flyBehavior = new FlyWithWings();
    private IQuackBehavior quackBehavior = new Quack();

    public ReuseCodeForDuck(String name) {
        this.name = name;
    }

    public IFlyBehavior performFly() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior performQuack() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.print(name);
        System.out.print(" | ");
        performFly().fly();
        System.out.print(" | ");
        performQuack().quack();
    }
}