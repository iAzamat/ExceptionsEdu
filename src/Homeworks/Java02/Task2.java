package Homeworks.Java02;

/*
Дан следующий код, исправьте его там, где требуется
 */

public class Task2 {
    /**
     * Добавлен массив intArray,
     * добавлено отслеживание ошибки выхода за пределы массива
     */
    public static void task2() {
        try {
            int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 15};
            int d = 0;
            int index = 8;
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
