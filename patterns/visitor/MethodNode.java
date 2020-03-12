package patterns.visitor;

import java.util.List;

public class MethodNode extends AbstractElement implements IElement {

    public MethodNode(String name, List<IElement> statements) {
        super(name, List.of(statements));
    }

    @Override
    public void accept(IVisitor aVisitor) {
        for (List<IElement> statementGroup : this.elementGroup) {
            for (IElement statement : statementGroup) {
                aVisitor.visit(statement);
            }
        }
    }
}