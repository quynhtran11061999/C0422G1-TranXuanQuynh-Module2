package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng Scanner
        System.out.println("Enter width:");
//        width = scanner.nextFloat(); // nhập chiều rộng
        width = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter height:");
//        height = scanner.nextFloat(); // nhập chiều dài
        height = Float.parseFloat(scanner.nextLine());
        float area = width * height;
        System.out.println("Area = " + area);
    }
}
