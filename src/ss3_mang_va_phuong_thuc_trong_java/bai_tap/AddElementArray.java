package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập x là số cần chèn");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí cần chèn");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        System.out.println("Mảng của bạn sau khi thêm là: " + Arrays.toString(arr));
    }
}
