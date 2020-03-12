package patterns.visitor;

import java.util.List;

public class ClassNode extends AbstractElement implements IElement {

    public ClassNode(final String name, List<List<IElement>> elementGroup) {
        super(name, elementGroup);
    }

    @Override
    public void accept(IVisitor aVisitor) {
        for (List<IElement> elementList : this.elementGroup) {
            for (IElement element : elementList) {
                aVisitor.visit(element);
                element.accept(aVisitor);
            }
        }
    }
}