package ss7_AbstractClass_Interface.bai_tap.Resizeable;

import ss6_ke_thua.thuc_hanh.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius;
    private String color;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color =color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return (this.radius*this.radius)*Math.PI;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public void resize(double percent) {
        radius += radius * percent;
    }
}
