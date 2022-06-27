package ss16_IO_Text_File.bai_tap.Doc_File_Csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainCountry {
    public static List<String> readFile(String pathReadFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathReadFile);
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line.split(",")[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = readFile("src/ss16_IO_Text_File/bai_tap/Doc_File_Csv/Country.csv");
    }
}
