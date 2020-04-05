package patterns.extensionobject;

import patterns.extensionobject.extensions.OneSpecificExtension;

public class App {
    public static void main(String[] args) {
        ISubject sample = new ConcreteSubject();
        sample.addExtension("Extension1", OneSpecificExtension.class);

        OneSpecificExtension extension = (OneSpecificExtension) sample.getExtension("Extension1");
        sample.sampleMethod("Test");
        extension.printOne();
    }
}