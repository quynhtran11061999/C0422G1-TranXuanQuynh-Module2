package ss11_Dsa_Stack_Queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InvertedElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng");
        Stack<Integer> stack = new Stack<>(); 
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
            stack.push(arr[i]);
        }
        System.out.println("Mảng trước khi đảo: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo: " + Arrays.toString(arr));
    }
}
