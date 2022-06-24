package ss12_Java_Collection_Framework.bai_tap.mvc.service.implement;

import ss12_Java_Collection_Framework.bai_tap.mvc.commom.SortIncrease;
import ss12_Java_Collection_Framework.bai_tap.mvc.model.Product;
import ss12_Java_Collection_Framework.bai_tap.mvc.commom.SortDescending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "dầu gội", 5000));
        products.add(new Product(2, "sữa tắm", 10000));
        products.add(new Product(3, "nước rửa chén", 15000));
    }

    public void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        products.add(new Product(id, name, price));
    }

    public void edit() {
        boolean flag = true;
        System.out.println("Nhập id bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                System.out.println("sửa tên sản phẩm");
                String newName = scanner.nextLine();
                products.get(i).setName(newName);
                System.out.println("sửa giá sản phẩm");
                int newprice = Integer.parseInt(scanner.nextLine());
                products.get(i).setPrice(newprice);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("id bạn nhập không có trong danh sách");
        }
    }

    public void delete() {
        boolean flag = true;
        System.out.println("Nhập id bạn muốn xóa");
        int id1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id1 == products.get(i).getId()) {
                products.remove(i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("id bạn nhập không có trong danh sách");
        }
    }

    public void display() {
        for (Product p : products) {
            System.out.println(p);

        }
    }

    public void search() {
        boolean flag = true;
        System.out.println("Nhập tên muốn tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(products.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Tên sản phẩm bạn tìm không có trong danh sách");
        }
    }

    public void sortUp() {
        SortIncrease sortIncrease = new SortIncrease();
        Collections.sort(products, sortIncrease);
        display();
    }

    public void sortDown() {
        SortDescending sortDescending = new SortDescending();
        Collections.sort(products, sortDescending);
        display();

    }
}
