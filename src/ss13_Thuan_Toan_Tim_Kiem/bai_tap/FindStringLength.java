package ss13_Thuan_Toan_Tim_Kiem.bai_tap;


import java.util.Stack;

public class FindStringLength {
    static String string = "Welcome";
    static Stack<Character> list = new Stack<>();

    public static void main(String[] args) {
        list.add(string.charAt(0));
        for (int i = 0; i < string.length(); i++) {
            if (list.peek() < string.charAt(i)) {
                list.add(string.charAt(i));
            }
        }
        System.out.println(list);
    }
}
