package duck.flyable;

public class FlyWithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.print("Flying with wings");
    }
}