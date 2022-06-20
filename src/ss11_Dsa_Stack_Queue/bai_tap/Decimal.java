package ss11_Dsa_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack<>();
        System.out.println("Nhập vào 1 số");
        int number = Integer.parseInt(scanner.nextLine());
        do {
            stack.add(number % 2);
            number = number / 2;
        } while (number > 0);
        String string = "";
        while (!stack.isEmpty()) {
            string += stack.pop();
        }
        System.out.println(string);
    }
}
