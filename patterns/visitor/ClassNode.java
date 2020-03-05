package patterns.visitor;

import java.util.List;

public class ClassNode implements IElement {

    private final String name;
    private final List<IElement> methods;
    private final List<IElement> fields;

    public ClassNode(final String name, List<IElement> methods, List<IElement> fields) {
        this.name = name;
        this.methods = methods;
        this.fields = fields;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(IVisitor aVisitor) {
        for (IElement method : this.methods) {
            aVisitor.visit(method);
        }

        for (IElement field : this.fields) {
            aVisitor.visit(field);
        }
    }
}