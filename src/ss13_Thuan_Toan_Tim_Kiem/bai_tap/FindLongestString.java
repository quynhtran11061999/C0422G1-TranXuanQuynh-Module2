package ss13_Thuan_Toan_Tim_Kiem.bai_tap;

import java.util.LinkedList;

public class FindLongestString {
    static String string = "abcabcdgabmnsxy";
    static LinkedList<Character> list = new LinkedList<>();
    static LinkedList<Character> max = new LinkedList<>();

    public static void main(String[] args) {

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (max.size() < list.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println(max);
    }
}
