package ss12_Java_Collection_Framework.bai_tap.mvc.controller;

import ss12_Java_Collection_Framework.bai_tap.mvc.service.implement.ProductManager;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {

        ProductManager productManager = new ProductManager();
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Thêm sản phẩm" +
                    "\n 2. Sửa thông tin sản phầm" +
                    "\n 3. Xóa sản phầm" +
                    "\n 4. Hiển thị sản phẩm" +
                    "\n 5. Tìm sản phầm" +
                    "\n 6. Sắp xếp sản phẩm tăng dần theo giá" +
                    "\n 7. Sắp xếp sản phẩm giảm dần theo giá" +
                    "\n 8. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng thêm");
                    productManager.add();
                    break;
                case 2:
                    System.out.println("Chức năng sửa thông tin");
                    productManager.edit();
                    break;
                case 3:
                    System.out.println("Chức năng xóa sản phầm");
                    productManager.delete();
                    break;
                case 4:
                    System.out.println("Chức năng hiển thị");
                    productManager.display();
                    break;
                case 5:
                    System.out.println("Chức năng tìm kiếm");
                    productManager.search();
                    break;
                case 6:
                    System.out.println("Chức năng sắp xếp sản phẩm tăng dần theo giá");
                    productManager.sortUp();
                    break;
                case 7:
                    System.out.println("Chức năng sắp xếp sản phẩm giảm dần theo giá");
                    productManager.sortDown();
                    break;
                case 8:
                    System.exit(8);
                default:
                    flag = false;
            }
        } while (flag);
    }
}