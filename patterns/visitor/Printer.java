package patterns.visitor;

import java.io.PrintStream;

public class Printer implements IVisitor {

    private PrintStream printStream;

    public Printer(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void visit(IElement anElement) {
        printStream.println("Visiting " + anElement.getClass().getSimpleName() + ": " + anElement.getName());
    }

}