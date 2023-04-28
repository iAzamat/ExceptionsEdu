package Homeworks.Java03.Modules;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку через пробел как показанно на примере " +
                    "(Иванов Иван Иванович 10.10.2000 1234567890 f или m )");
            String data = sc.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("Вы ввели не все данные, попробуйте снова");
            } else System.out.println("Вы ввели слишком много данных, попробуйте снова");
        }
    }
}
