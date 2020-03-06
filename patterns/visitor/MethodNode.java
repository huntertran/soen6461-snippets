package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class MethodNode extends AbstractElement implements IElement {

    public MethodNode(String name, List<IElement> statements) {
        super(name, null);
    }

    @Override
    public void accept(IVisitor aVisitor) {
        for (List<IElement> statement : this.elementGroup) {
            // aVisitor.visit(statement);
        }
    }

    @Override
    public void open(IElement element) {

    }

}