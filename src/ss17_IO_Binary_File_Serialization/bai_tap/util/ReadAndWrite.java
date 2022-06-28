package ss17_IO_Binary_File_Serialization.bai_tap.util;

import ss17_IO_Binary_File_Serialization.bai_tap.models.ProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<ProductManager> readObjectToListProduct(String pathFile) {
        List<ProductManager> productManagers = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productManagers = (List<ProductManager>) objectInputStream.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file.length() > 0) {
                    fileInputStream.close();
                    objectInputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productManagers;
    }

    public static void writeObjectToListProduct(List<ProductManager> productManagers, String pathFile) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productManagers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
