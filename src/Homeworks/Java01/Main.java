package Homeworks.Java01;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.

* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArray1 = generateArr(10);
        int[] myArray2 = generateArr(10);
        int[] myArray3 = generateArr(11);

        printDifferenceArrays(myArray1, myArray2);
        printDifferenceArrays(myArray1, myArray3);

        printDivideArrays(myArray1, myArray2);
        printDivideArrays(myArray1, myArray3);
    }

    /**
     * Метод для вычисления разности дух массивов
     *
     * @param array1
     * @param array2
     * @return
     */
    public static int[] differenceArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не совпадают\n");
        }
        int size = array1.length;
        int[] arrayResult = new int[size];
        for (int i = 0; i < size; i++) {
            arrayResult[i] = array1[i] - array2[i];
        }
        return arrayResult;
    }


    /**
     * Метод генерации одномерного массива
     *
     * @param size
     * @return
     */
    public static int[] generateArr(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    /**
     * Метод печати разности двух массивов
     *
     * @param array1
     * @param array2
     */
    public static void printDifferenceArrays(int[] array1, int[] array2) {
        System.out.println("Первый массив:");
        printArr(array1);
        System.out.println("Второй массив:");
        printArr(array2);
        try {
            System.out.println("Результат:");
            printArr(differenceArrays(array1, array2));
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * Метод печати одномерного массива
     *
     * @param array
     */
    public static void printArr(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArrDouble(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static double[] divideArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не совпадают\n");
        }
        int size = array1.length;
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Ошибка! Деление на ноль");
            }
            double a = array1[i];
            double b = array2[i];
            result[i] = Math.round(a / b * 1000.0) / 1000.0;
        }
        return result;
    }

    public static void printDivideArrays(int[] array1, int[] array2) {
        System.out.println("Первый массив:");
        printArr(array1);
        System.out.println("Второй массив:");
        printArr(array2);
        try {
            System.out.println("Результат:");
            printArrDouble(divideArrays(array1, array2));
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
