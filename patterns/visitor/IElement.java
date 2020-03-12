package patterns.visitor;

public interface IElement {
    void open(IElement element);

    void accept(IVisitor aVisitor);

    String getName();
}