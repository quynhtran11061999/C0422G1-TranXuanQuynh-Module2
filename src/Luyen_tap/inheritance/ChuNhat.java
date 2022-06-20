package Luyen_tap.inheritance;

public class ChuNhat extends Hinh{
    private double width;
    private double height;
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    public ChuNhat() {
    }

    public ChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
