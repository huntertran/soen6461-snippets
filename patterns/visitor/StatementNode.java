package patterns.visitor;

public class StatementNode extends AbstractElement implements IElement {

    public StatementNode(String name) {
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