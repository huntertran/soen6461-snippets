package patterns.singleton;

public class App {
    public static void main(String[] args) {
        var sortAlgorithms = Factory.getInstance().getAllSortAlgorithm();
    }
}