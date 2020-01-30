package duck.quackable;

public class Quack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.print("Normal Quack");
    }
}