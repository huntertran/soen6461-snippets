package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<IElement> methods = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<IElement> statements = new ArrayList<>();

            for (int j = 0; j < 4; j++) {
                StatementNode statement = new StatementNode(String.valueOf(j));
                statements.add(statement);
            }

            MethodNode method = new MethodNode(String.valueOf(i), statements);
            methods.add(method);
        }

        List<IElement> fields = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            FieldNode field = new FieldNode(String.valueOf(i));
            fields.add(field);
        }

        ClassNode aClassNode = new ClassNode("testClass", methods, fields);

        // aClassNode.accept(aVisitor);
    }
}