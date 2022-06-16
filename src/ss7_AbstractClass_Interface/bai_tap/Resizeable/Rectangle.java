package ss7_AbstractClass_Interface.bai_tap.Resizeable;

import ss6_ke_thua.thuc_hanh.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double side, double v, String color, boolean filled){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        width += width * percent;
        height += height *percent;
    }
}
