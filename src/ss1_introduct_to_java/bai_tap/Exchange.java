package ss1_introduct_to_java.bai_tap;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD:");
        usd = Double.parseDouble(scanner.nextLine());
        double quydoi = usd * 23000;
        System.out.println("Giá trị VND: " + quydoi);
    }
}
