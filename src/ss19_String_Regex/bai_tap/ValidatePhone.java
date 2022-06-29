package ss19_String_Regex.bai_tap;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần kiểm tra");
        String numberPhone = scanner.nextLine();
        String regex = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        boolean check = numberPhone.matches(regex);
        System.out.println(check);
    }
}
