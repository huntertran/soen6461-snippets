package patterns.extensionobject;

import patterns.extensionobject.extensions.AnotherSpecificExtension;
import patterns.extensionobject.extensions.IExtension;
import patterns.extensionobject.extensions.NoExtension;
import patterns.extensionobject.extensions.OneSpecificExtension;

public class ConcreteSubject implements Subject {

    @Override
    public IExtension getExtension(String extensionName) {
        switch (extensionName) {
            case "OneSpecificExtension": {
                return new OneSpecificExtension();
            }
            case "AnotherSpecificExtension": {
                return new AnotherSpecificExtension();
            }
            default: {
                return new NoExtension();
            }
        }
    }

}