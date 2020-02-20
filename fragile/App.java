package fragile;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        InstrumentedHashSet<String> hashSet = new InstrumentedHashSet<String>();

        hashSet.add("Test");
        hashSet.addAll(Arrays.asList("Test 1", "Test 2", "Test 3"));

        hashSet.remove("Test");

        System.out.println(hashSet.getAddCount());
    }
}