package duck.quackable;

public class NoQuack implements IQuackBehavior {
    @Override
    public void quack(){
        System.out.print("No sound");
    }
}