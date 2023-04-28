package Homeworks.Java03.Exception;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Ошибка: Введены некорректные данные для пола");
        System.out.printf("Было введено: %s\nОжидается: f или m", i);
        System.out.println();
    }
}