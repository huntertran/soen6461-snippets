package patterns.extensionobject;

public class ConcreteSubject extends AbstractSubject implements ISubject {

    @Override
    public String methodToExtend(String param) {
        System.out.println(param);
        return param;
    }

}