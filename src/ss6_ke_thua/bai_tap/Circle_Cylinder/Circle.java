package ss6_ke_thua.bai_tap.Circle_Cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
        return (this.radius * this.radius) * Math.PI;
    }

    @Override //thong bao
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}' +
                "Area= " + getArea();
    }
//tinh da hinh" 1 phuong thuc co the su dung theo nhieu cach khac nhau va cho ra cac ket qua khac nhau

}
