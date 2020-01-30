package duck.quackable;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack(){
        System.out.print("Rubber Squeak");
    }
}