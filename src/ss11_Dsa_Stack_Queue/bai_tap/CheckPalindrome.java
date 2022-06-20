package ss11_Dsa_Stack_Queue.bai_tap;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strings = "Able was I ere I saw Elba";
        Stack<Character> stack = new Stack();
        for (int i = 0; i < strings.length(); i++) {
            stack.push(strings.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }
        if (strings.equalsIgnoreCase(reverseString)) {
            System.out.println("Đây là chuỗi palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi palindrome");
        }
    }
}
