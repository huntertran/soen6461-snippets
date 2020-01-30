package duck;

import duck.flyable.IFlyBehavior;
import duck.quackable.IQuackBehavior;

public interface IDuck {
    static void swim() {
        System.out.print("Duck swimming");
    }

    IFlyBehavior performFly();

    void setFlyBehavior(IFlyBehavior flyBehavior);

    IQuackBehavior performQuack();

    void setQuackBehavior(IQuackBehavior quackBehavior);

    void display();
}