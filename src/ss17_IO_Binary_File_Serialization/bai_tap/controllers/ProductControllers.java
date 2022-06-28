package ss17_IO_Binary_File_Serialization.bai_tap.controllers;


import ss17_IO_Binary_File_Serialization.bai_tap.service.IService;
import ss17_IO_Binary_File_Serialization.bai_tap.service.ProductManagerImpl;

import java.util.Scanner;

public class ProductControllers {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        IService productManager = new ProductManagerImpl();
        int choiceMenu;
        do {
            System.out.println("1. Thêm sản phẩm\n" +
                    "2. Hiển thị thông tin sản phẩm\n" +
                    "3. Tìm kiếm sản phẩm\n" +
                    "4. Exit\n"
            );
            System.out.println("Chọn chức năng: ");
            choiceMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceMenu) {
                case 1:
                    System.out.println("Chức năng thêm sản phẩm");
                    productManager.add();
                    break;
                case 2:
                    System.out.println("Chức năng hiển thị thông tin");
                    productManager.display();
                    break;
                case 3:
                    System.out.println("Chức năng tìm kiếm sản phầm");
                    productManager.search();
                    break;
                case 4:
                    System.out.println("Exit program");
                    System.exit(0);
                default:
                    System.out.println("Enter again!");
            }
        } while (choiceMenu != 4);
    }
}
