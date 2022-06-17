package ss8_CleanCode_Refactoring.thuc_hanh;

import java.util.Scanner;

public class MainRefactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số thứ nhất");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số thứ hai");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào toán tử");
        char operator = scanner.nextLine().charAt(0);



        System.out.println(Refactoring.calculate(number1,number2,operator));

    }
}
