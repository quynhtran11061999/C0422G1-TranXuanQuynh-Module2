package ss4_lop_va_doi_tuong_trong_Java.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều dài:");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hình chữ nhật: "+ rectangle.display());
        System.out.println("Chu vi hình chữ nhât là: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhât là: " + rectangle.getArea());
    }
}
