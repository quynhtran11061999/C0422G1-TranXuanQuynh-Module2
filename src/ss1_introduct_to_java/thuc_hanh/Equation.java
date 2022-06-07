package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho một phương trình 'a*x+c=c' vui lòng nhập hằng số:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        if (a == 0 && b == 0) {
            System.out.println("phương trình vô số nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.println("phương trình vô nghiệm");
        } else {
            System.out.println("phương trình có 1 nghiệm duy nhất: " + (-b / a));
        }
    }
}
