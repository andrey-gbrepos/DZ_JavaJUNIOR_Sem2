public class MainHomework {
    /**
     * В существующий класс ObjectCreator добавить поддержку аннотации RandomDate (по аналогии с Random):
     * 1. Аннотация должна обрабатываться только над полями типа java.util.Date
     * 2. Проверить, что min < max
     * 3. В поле, помеченной аннотацией, нужно вставлять рандомную дату,
     * UNIX-время которой находится в диапазоне [min, max)
     *
     * 4. *** Добавить поддержку для типов Instant, ...
     * 5. *** Добавить атрибут Zone и поддержку для типов LocalDate, LocalDateTime
     */

    /**
     * Примечание:
     * Unix-время - количество милисекунд, прошедших с 1 января 1970 года по UTC-0.
     */

    // FIXME: Заставить аннотацию ставится только над полями

    public static void main(String[] args) throws Exception {

        Class<MyDate> myDateClass = MyDate.class;
        System.out.println("\n" + "Получение рандомной даты: ");
        System.out.println(ObjectCreator.createObj(myDateClass).getMyDate());
    }
}