package patterns.extensionobject;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import patterns.extensionobject.extensions.IExtension;

public abstract class AbstractSubject {
    private final Map<String, IExtension> mapOfExtensionInstances = new HashMap<String, IExtension>();

    public void addExtension(final String extensionName, final Class<? extends IExtension> extensionClass) {
        try {
            final IExtension extension = extensionClass.newInstance();
            final Method dependencyInjector = extensionClass.getMethod("setExtendedSubject", ISubject.class);
            dependencyInjector.invoke(extension, this);
            this.mapOfExtensionInstances.put(extensionName, extension);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final IExtension getExtension(final String extensionName) {
        return this.mapOfExtensionInstances.get(extensionName);
    }

    public final void removeExtension(final String extensionName) {
        this.mapOfExtensionInstances.remove(extensionName);
    }
}