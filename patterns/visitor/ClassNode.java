package patterns.visitor;

import java.util.List;

public class ClassNode extends AbstractElement implements IElement {
    private final List<List<IElement>> elementGroup;

    public ClassNode(final String name, List<List<IElement>> elementGroup) {
        super(name);
        this.elementGroup = elementGroup;
    }

    @Override
    public void accept(IVisitor aVisitor) {
        for (List<IElement> elementList : elementGroup) {
            for (IElement element : elementList) {
                aVisitor.visit(element);
            }
        }
    }
}