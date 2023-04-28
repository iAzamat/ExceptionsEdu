package Homeworks.Java03;

import Homeworks.Java03.Exception.DataException;
import Homeworks.Java03.Modules.ParsData;
import Homeworks.Java03.Modules.WriteFile;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();
        String newFileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        }


        newFileName = data.get("lastName").toString() + ".txt";
        String filePath = newFileName;

        StringBuilder sb = new StringBuilder();
        String[] formatData = {"lastName", "firstName", "patronymic", "date", "tel", "sex"};
        for (String str : formatData) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        writeFile.writeData(String.valueOf(sb), filePath);

    }
}
