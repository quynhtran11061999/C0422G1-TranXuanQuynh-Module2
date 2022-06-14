package ss6_ke_thua.bai_tap.Point_MoveablePoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2,3,4,5);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
