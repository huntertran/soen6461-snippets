package overloading;

public class Point {
    public boolean equals(final Object anObject) {
        System.out.println("equals called with OBJECT");
        return false;
    }

    public boolean equals(final Point aPoint) {
        System.out.println("equals called with Point");
        return false;
    }
}