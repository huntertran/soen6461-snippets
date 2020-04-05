package patterns.extensionobject.extensions;

import patterns.extensionobject.ISubject;

public class OneSpecificExtension implements IExtension {

    ISubject extendedSubject;

    @Override
    public void setExtendedSubject(ISubject extendedSubject) {
        this.extendedSubject = extendedSubject;
    }

    public void printOne() {
        extendedSubject.sampleMethod("sample method in extension");
        System.out.println("One Extension");
    }
}