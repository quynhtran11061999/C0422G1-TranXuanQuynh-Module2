package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập x là phần tử cần xóa");
        int x = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < arr.length; j++) {
            if (x == arr[j]) {
                for (int y = j; y < arr.length - 1; y++) {
                    arr[y] = arr[y + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println("Mảng của bạn sau khi xóa x là: " + Arrays.toString(arr));
    }
}
