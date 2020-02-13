package overloading;

public class App {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        final SuperClass superClass = new SubClass();
        superClass.foo();
        // Foo from Sub class

        final SubClass subClass = new SubClass();
        ((SuperClass)subClass).foo();
        // Foo from Sub class
    }
}