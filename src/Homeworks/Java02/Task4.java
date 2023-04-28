package Homeworks.Java02;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
    Задача 4
    Разработайте программу,
    которая выбросит Exception,
    когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение,
    что пустые строки вводить нельзя.
 */


public class Task4 {
    /**
     * @return возвращает введённую строку
     */
    public static String notEmptyString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.isEmpty())
            throw new IllegalArgumentException("пустые строки вводить нельзя!");
        else
            System.out.println(str);
        return str;
    }

    public static void task4() {
        try {
            System.out.println("Введите строку: ");
            notEmptyString();
        } catch (IllegalArgumentException e) {
            System.out.println("[Ошибка]: " + e);
            task4();
        }
    }
}
