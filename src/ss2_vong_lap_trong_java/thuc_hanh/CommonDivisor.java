package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập b:");
        b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
            while (a != b) {
                if (a > b)
                    a = a - b;
                 else
                    b = b - a;
            }
            System.out.println("Ước chung lớn nhất " + a);
        }
    }
}
