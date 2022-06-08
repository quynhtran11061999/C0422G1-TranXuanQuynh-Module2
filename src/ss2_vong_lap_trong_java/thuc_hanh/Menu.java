package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình tam giác");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ hình chữ nhật");
        System.out.println("0. Exit");
        System.out.println("Sự lựa chọn của bạn:");
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    break;
                case 3:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn");

            }
        }
    }
}
