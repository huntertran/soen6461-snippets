package patterns.visitor;

public class StatementNode implements IElement {

    private final String name;

    public StatementNode(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(IVisitor aVisitor) {
        aVisitor.visit(this);
    }
}