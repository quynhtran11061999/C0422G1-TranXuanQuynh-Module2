package Luyen_tap.inheritance;

public class HinhTron extends Hinh{//class binh thuong
    private double radius;

    @Override
    public double getArea() {
        return this.radius*this.radius;
    }


    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron() {
    }
}
