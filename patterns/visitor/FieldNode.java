package patterns.visitor;

import java.util.List;

public class FieldNode extends AbstractElement implements IElement {
    public FieldNode(String name) {
        super(name,null);
    }

    @Override
    public void accept(IVisitor aVisitor) {
        aVisitor.visit(this);
    }

    @Override
    public void open(IElement element) {
        // TODO Auto-generated method stub

    }
}