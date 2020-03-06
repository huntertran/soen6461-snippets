package patterns.visitor;

public abstract class AbstractElement {
    private final String name;

    public AbstractElement(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}