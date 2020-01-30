package duck;

import duck.quackable.NoQuack;

public class App {
    public static void main(String[] args) {
        IDuck rubberDuck = new RubberDuck();
        rubberDuck.display();

        System.out.println();

        IDuck brokenRubberDuck = new RubberDuck();
        brokenRubberDuck.setQuackBehavior(new NoQuack());
        brokenRubberDuck.display();
    }
}