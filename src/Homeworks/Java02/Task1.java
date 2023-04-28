package Homeworks.Java02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Задача 1
 Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение.
 Ввод текста вместо числа не должно приводить к падению приложения,
 вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
    private static float floatnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число через запятую: ");
        float num = sc.nextFloat();
        System.out.println("Вы ввели:\n" + num);
        return num;
    }


    public static float floatProcessingEnteredData() {
        float result = 0;
        try {
            result = floatnum();
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод!");
            floatProcessingEnteredData();
        }
        return result;
    }
}
