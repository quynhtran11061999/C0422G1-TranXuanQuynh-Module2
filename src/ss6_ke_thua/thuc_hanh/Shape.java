package ss6_ke_thua.thuc_hanh;

import ss7_AbstractClass_Interface.bai_tap.Resizeable.Resizeable;

public abstract class Shape implements Resizeable {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    @Override
    public String toString() {
        return "A Shape with color of xxx and filled/not filled" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
