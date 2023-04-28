package Homeworks.Java03.Exception;

public class DataException extends Exception {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Ошибка: Неверный формат данных");
        System.out.printf("Неверный формат: %s", i);
        System.out.println();
    }
}

