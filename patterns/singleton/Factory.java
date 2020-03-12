package patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private static final class UniqueFactoryHolder {
        private static final Factory UNIQUE_FACTORY = new Factory();
    }

    public static Factory getInstance() {
        return UniqueFactoryHolder.UNIQUE_FACTORY;
    }

    public List<ISort> getAllSortAlgorithm() {
        return new ArrayList<ISort>();
    }
}