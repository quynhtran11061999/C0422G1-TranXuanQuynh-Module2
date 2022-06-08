package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        int month;
        double interestRate;
        System.out.println("Nhập số tiền gửi:");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tháng");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Tỷ lệ lãi suất");
        interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i <month ; i++) {
         totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng số tiền lãi là " + totalInterest);
    }
}
