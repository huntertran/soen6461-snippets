package patterns.visitor;

public class FieldNode extends AbstractElement implements IElement {
    public FieldNode(String name) {
        super(name, null);
    }

    @Override
    public void accept(IVisitor aVisitor) {
        aVisitor.visit(this);
    }
}