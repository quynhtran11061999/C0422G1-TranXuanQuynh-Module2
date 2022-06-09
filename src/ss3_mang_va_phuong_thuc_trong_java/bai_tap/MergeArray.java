package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        int[] arr2 = new int[5];
        for (int j = 0; j < 5; j++) {
            arr2[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng 2: " + Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];
        }
        System.out.println("Mảng 3: " + Arrays.toString(arr3));
    }
}


