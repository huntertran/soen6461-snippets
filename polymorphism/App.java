package polymorphism;

public class App {
    public static void main(String[] args) {
        final SuperClass superClass = new SubClass();
        superClass.foo("");

        final SubClass subClass = new SubClass();
        ((SuperClass) subClass).foo("");
    }
}