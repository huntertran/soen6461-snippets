package patterns.visitor;

public class FieldNode implements IElement {

    private final String name;

    public FieldNode(String name){
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