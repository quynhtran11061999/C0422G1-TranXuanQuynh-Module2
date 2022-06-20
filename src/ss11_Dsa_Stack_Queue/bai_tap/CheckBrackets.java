package ss11_Dsa_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        System.out.println("Nhập vào biểu thức");
        String bieuThuc = scanner.nextLine();
        String ngoacTrai = "(";
        String ngoacPhai = ")";
        for (int i = 0; i < bieuThuc.length(); i++) {
            if (bieuThuc.charAt(i) == ngoacTrai.charAt(0)) {
                bStack.push(bieuThuc.charAt(i));
            }
            if (bieuThuc.charAt(i) == ngoacPhai.charAt(0)) {
                if (bStack.isEmpty()) {
                    System.out.println("Biểu thức sai");
                    bStack.push(bieuThuc.charAt(0));
                    break;
                } else {
                    if (bStack.peek() != bieuThuc.charAt(i)) {
                        bStack.pop();
                    }
                }
            }
        }
        System.out.println(bieuThuc);
        System.out.println(bStack);
        if (bStack.isEmpty()) System.out.println("true");
        else System.out.println("false");
    }
}
