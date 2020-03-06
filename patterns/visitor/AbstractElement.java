package patterns.visitor;

import java.util.List;

public abstract class AbstractElement {
    private final String name;

    final List<List<IElement>> elementGroup;

    public AbstractElement(String name, List<List<IElement>> elementGroup) {
        this.name = name;
        this.elementGroup = elementGroup;
    }

    public String getName() {
        return this.name;
    }
}