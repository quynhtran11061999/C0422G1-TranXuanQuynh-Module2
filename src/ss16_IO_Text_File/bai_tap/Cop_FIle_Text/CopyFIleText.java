package ss16_IO_Text_File.bai_tap.Cop_FIle_Text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFIleText {
     public static List<String> readFile(String sourcePathFile){
         List<String> list =  new ArrayList<>();
         File file = new File(sourcePathFile);
         try {
             FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line = "";
             while ((line = bufferedReader.readLine())!= null){
                 list.add(line);
             }
             bufferedReader.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return list;
     }
     public static void writeFile(List<String> list,String targetPathFIle){
         File file = new File(targetPathFIle);
         try {
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             for (int i = 0; i <list.size() ; i++) {
                 bufferedWriter.write(list.get(i));
                 bufferedWriter.newLine();
             }
             bufferedWriter.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    public static void main(String[] args) {
        List<String> list = readFile("src/ss16_IO_Text_File/bai_tap/SourceFile.txt");
        writeFile(list,"src/ss16_IO_Text_File/bai_tap/TargetFile.txt");
    }
}
