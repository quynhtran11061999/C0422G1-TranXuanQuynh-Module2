package ss15_Xu_Ly_Ngoai_Le_Debug.bai_tap;

import java.util.Scanner;

public class MainMyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c");
        int c = Integer.parseInt(scanner.nextLine());

        MyTriangle myTriangle = new MyTriangle();
        try {
            myTriangle.check(a, b, c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
            System.out.println(myTriangle);

        }
    }
}
