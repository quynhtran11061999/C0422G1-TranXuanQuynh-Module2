package ss19_String_Regex.bai_tap;

import java.util.Scanner;

public class ValidateCLass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp học cần kiểm tra");
        String classes = scanner.nextLine();
        String regex = "(^[CAP][0-9]{4}[GHIKLM])$";
        boolean check = classes.matches(regex);
        System.out.println(check);
    }
}
