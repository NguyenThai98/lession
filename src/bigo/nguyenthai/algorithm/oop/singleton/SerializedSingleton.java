package bigo.nguyenthai.algorithm.oop.singleton;

import java.io.Serializable;

/**
 * Date: 4/6/2023<br/>
 * Time: 3:38 PM<br/>
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 1741825395699241705L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /**
     * Special hook provided by serialization where developer can control what object needs to sent.
     * However this method is invoked on the new object instance created by de serialization process.
     *
     * @return
     * @throws ObjectStreamException
     */
//    private Object readResolve() throws ObjectStreamException {
//        return SingletonHelper.instance;
//    }

}
