import java.lang.reflect.Field;
import java.util.Date;

public class RandomDateAnnotationProcessor {

    public static void processAnnotation(Object obj) {
        java.util.Random random = new java.util.Random();
        Class<?> objClass = obj.getClass();
        for (Field field : objClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(RandomDate.class) &&
                    field.getType().isAssignableFrom(java.util.Date.class)) {
                RandomDate annotation = field.getAnnotation(RandomDate.class);
                long var = 0;
                long min = annotation.min();
                long max = annotation.max();
                if (min > max) {
                    var = min;
                    min = max;
                    max = var;
                }
                Date date = new Date(random.nextLong(min, max));
                try {
                    field.setAccessible(true); // чтобы можно было изменять финальные поля
                    field.set(obj, date);
                } catch (IllegalAccessException e) {
                    System.err.println("Не удалось вставить значение в поле: " + e.getMessage());
                }
            }
        }
    }
}