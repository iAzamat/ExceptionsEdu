package Homeworks.Java03.Modules;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeData(String data, String path) {
//        System.out.println(path);
//        System.out.println(path.getClass().getSimpleName());

        try (FileWriter fw = new FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
            fw.close();
            System.out.println("Файл " + path + " успешно записан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
