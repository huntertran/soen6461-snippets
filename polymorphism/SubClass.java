package polymorphism;

public class SubClass extends SuperClass {
    public void foo(final Object anObject) {
        super.foo(this);
        System.out.println("Foo() from SubClass with object parameter");
    }

    public void foo(final String aString) {
        super.foo(this);
        System.out.println("Foo() from SubClass with STRING parameter");
    }
}