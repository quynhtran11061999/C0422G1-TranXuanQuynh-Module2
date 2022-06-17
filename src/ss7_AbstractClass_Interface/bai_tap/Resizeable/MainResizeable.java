package ss7_AbstractClass_Interface.bai_tap.Resizeable;

import ss6_ke_thua.thuc_hanh.Shape;

public class MainResizeable {
    public static void main(String[] args) {
        double percent = Math.floor(Math.random() * 100 + 1) / 100;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Square(4);
        System.out.println("Diện tích hình tròn trước resize");
        System.out.println(shapes[0].getArea());
        shapes[0].resize(percent);
        System.out.println("Diện tích hình tròn sau resize");
        System.out.println(shapes[0].getArea());

        System.out.println("Diện tích hình chữ nhật trước resize");
        System.out.println(shapes[1].getArea());
        shapes[1].resize(percent);
        System.out.println("Diện tích hình chữ nhật sau resize");
        System.out.println(shapes[1].getArea());

        System.out.println("Diện tích square trước resize");
        System.out.println(shapes[2].getArea());
        shapes[2].resize(percent);
        System.out.println("Diện tích square sau resize");
        System.out.println(shapes[2].getArea());
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Hình " + (i + 1) +" diện tích là: " + shapes[0].getArea());
            if(shapes[i] instanceof Colorable) {
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}
