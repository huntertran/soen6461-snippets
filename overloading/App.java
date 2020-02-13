package overloading;

public class App {
    public static void main(String[] args) {
        final Point p1 = new Point();
        final Point p2 = new Point();
        final Object o = p1;

        System.out.println(p1.equals(p2));
        // equals called with Point

        System.out.println(o.equals(p2));
        // equals called with OBJECT

        System.out.println(p1.equals(o));
        // equals called with OBJECT
    }
}