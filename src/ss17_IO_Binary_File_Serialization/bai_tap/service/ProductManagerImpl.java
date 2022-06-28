package ss17_IO_Binary_File_Serialization.bai_tap.service;

import ss17_IO_Binary_File_Serialization.bai_tap.models.ProductManager;
import ss17_IO_Binary_File_Serialization.bai_tap.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerImpl implements IService {
    private final String PATH_FILE_PRODUCT = "src/ss17_IO_Binary_File_Serialization/bai_tap/data/product.dat";
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        List<ProductManager> productManagers = ReadAndWrite.readObjectToListProduct(PATH_FILE_PRODUCT);
        System.out.println("Nhập mã sản phẩm");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phầm");
        String tenSanPham = scanner.nextLine();
        System.out.println("Hãng sản xuất");
        String hangSanPham = scanner.nextLine();
        System.out.println("Gía sản phẩm");
        int giaSanPham = Integer.parseInt(scanner.nextLine());
        productManagers.add(new ProductManager(maSanPham, tenSanPham, hangSanPham, giaSanPham));
        ReadAndWrite.writeObjectToListProduct(productManagers, PATH_FILE_PRODUCT);
        display();
    }

    @Override
    public void display() {
        List<ProductManager> productManagers = ReadAndWrite.readObjectToListProduct(PATH_FILE_PRODUCT);
        for (ProductManager p : productManagers) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        List<ProductManager> productManagers = ReadAndWrite.readObjectToListProduct(PATH_FILE_PRODUCT);
        boolean flag = true;
        System.out.println("Nhập mã sản phầm muốn tìm");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                e.getMessage();
            }
        }
        for (int i = 0; i < productManagers.size(); i++) {
            if (productManagers.get(i).getMaSanPham() == id) {
                System.out.println("Đối tượng có mã sản phẩm = " + id + " tồn tại ở vị trí " + i);
                System.out.println(productManagers.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("mã bạn tìm không có");
        }
    }
}
