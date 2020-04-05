package patterns.extensionobject;

import patterns.extensionobject.extensions.IExtension;

public interface Subject {
    IExtension getExtension(String extensionName);
}