package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm bạn muốn kiểm tra");
        year = Integer.parseInt(scanner.nextLine());
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không phải là năm nhuận");
                }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
