public class App {
    public static void main(String[] args) {
        Measure length = new Length();
        int value = length.getValue();
        System.out.println(value);

        Measure size = new Size();
        value = size.getValue();
        System.out.println(value);
    }
}