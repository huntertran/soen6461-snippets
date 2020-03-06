package patterns.visitor;

import java.util.List;

public class MethodNode extends AbstractElement implements IElement {

    private final List<IElement> statements;

    public MethodNode(String name, List<IElement> statements) {
        super(name);
        this.statements = statements;
    }

    @Override
    public void accept(IVisitor aVisitor) {
        for (IElement statement : this.statements) {
            aVisitor.visit(statement);
        }
    }

}