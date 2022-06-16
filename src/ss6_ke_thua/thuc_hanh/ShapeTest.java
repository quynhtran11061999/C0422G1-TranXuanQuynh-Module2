package ss6_ke_thua.thuc_hanh;

import ss7_AbstractClass_Interface.bai_tap.Resizeable.Resizeable;

public abstract class ShapeTest implements Resizeable {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "blue",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5,5.8,"yellow",true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}

