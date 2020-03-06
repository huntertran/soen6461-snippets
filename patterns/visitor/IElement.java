package patterns.visitor;

public interface IElement {
    void accept(IVisitor aVisitor);
    String getName();
}