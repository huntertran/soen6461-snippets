package duck.flyable;

public class NoFly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.print("Can't fly");
    }
}