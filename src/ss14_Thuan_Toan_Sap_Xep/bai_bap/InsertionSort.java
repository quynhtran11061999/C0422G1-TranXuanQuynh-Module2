package ss14_Thuan_Toan_Sap_Xep.bai_bap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Mảng sau khi sử dụng thuận toán sắp xếp chèn");
        insertionSort(arr);

    }

    public static void insertionSort(int[] arr) {
        int x;
        int pos;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (0 < pos && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
            System.out.println("Lần thứ " + i + ": " + Arrays.toString(arr));
        }
    }
}
