import java.lang.reflect.Constructor;

public class ObjectCreator {

    public static <T> T createObj(Class<T> tClass) {
        try {
            Constructor<T> constructor = tClass.getConstructor();
            T objLocal = constructor.newInstance();
            RandomDateAnnotationProcessor.processAnnotation(objLocal);
            return objLocal;
        } catch (Exception e) {
            System.err.println("ниче не получилось: " + e.getMessage());
            return null; // throw new IllegalStateException
        }
    }
}
