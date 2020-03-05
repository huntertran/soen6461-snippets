package patterns.visitor;

import java.util.List;

public class MethodNode implements IElement {

    private final String name;
    private final List<IElement> statements;

    public MethodNode(String name, List<IElement> statements) {
        this.name = name;
        this.statements = statements;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(IVisitor aVisitor) {
        for (IElement statement : this.statements) {
            aVisitor.visit(statement);
        }
    }

}