package patterns.extensionobject;

import patterns.extensionobject.extensions.IExtension;

public interface ISubject {
    String methodToExtend(String param);
    IExtension getExtension(final String extensionName);
    void addExtension(final String extensionName, final Class<? extends IExtension> extensionClass);
    void removeExtension(final String extensionName);
}