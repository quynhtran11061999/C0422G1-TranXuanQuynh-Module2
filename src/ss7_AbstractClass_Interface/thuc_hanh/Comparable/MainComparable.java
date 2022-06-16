package ss7_AbstractClass_Interface.thuc_hanh.Comparable;

import java.util.Arrays;

public class MainComparable {
    public static void main(String[] args) {
        Comparable[]circles = new Comparable[3];
        circles[0] = new Comparable(3.6);
        circles[1] = new Comparable();
        circles[2] = new Comparable(3.5,"red");
        System.out.println("Sắp xếp trước");
        for (Comparable circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sắp xếp sau");
        for (Comparable circle : circles){
            System.out.println(circle);
        }
    }
}
