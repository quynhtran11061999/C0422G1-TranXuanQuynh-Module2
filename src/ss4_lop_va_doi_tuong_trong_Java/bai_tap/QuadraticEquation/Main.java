package ss4_lop_va_doi_tuong_trong_Java.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá trị b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá trị c:");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Giá trị a, b, c là: " + quadraticEquation.display());
        if (delta>0){
            System.out.println("Phương trình có 2 nghiệm " + quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        } else if (delta==0){
            System.out.println("Phương trình có 1 nghiệm "+ quadraticEquation.getRoot2());
        } else {
            System.out.println("Phương trình không có nghiệm ");
        }
    }
}
